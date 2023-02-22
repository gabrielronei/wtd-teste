class DynamicInput {

    constructor() {
        this.maxOptions = 5;
        this.index = Array.from(document.querySelectorAll(".dynamic-div")).length;
        this.createNewDivButton = document.getElementById("dynamic-div-creator");
        this.form = document.getElementsByTagName('form')[0];

        this.studentModal = new StudentModal();
    }


    _hideButtons() {
        if (this.index === 1) {
            document.querySelector(".deletar").style.display = "none";
        } else {
            Array.from(document.querySelectorAll(".deletar")).forEach(button => {
                button.style.display = "block";
            });
        }
    }

    _addDeleteLister(target) {
        target.addEventListener("click", async () => {
            let response = await this.studentModal.shouldRemove();
            if (response) {
                target.parentNode.closest('.dynamic-div').remove();
                this.index--;
                this._hideButtons();
            }
        });
    }

    _replaceInput(input) {
        this._clearValueFrom(input);
        let name = input.name;
        let newName = name.replace(/\[\d]./, "[" + this.index + "].");

        input.setAttribute("name", newName);
    }

    _clearValueFrom(input) {
        if (input.type === "checkbox") {
            input.checked = false;
        } else if (input.type === "select-one") {
            input.selectedIndex = 0;
        } else {
            input.value = "";
        }
    }

    createNewDiv(event) {

        if (this.index <= this.maxOptions) {
            event.preventDefault();
            const principalDiv = document.querySelectorAll(".dynamic-div")[this.index - 1];

            let clonedDiv = principalDiv.cloneNode(true);
            Array.from(clonedDiv.querySelectorAll("input, select")).forEach((input) => this._replaceInput(input));
            this._addDeleteLister(clonedDiv.querySelector(".deletar"));

            principalDiv.parentNode.insertBefore(clonedDiv, principalDiv.nextSibling);

            this.index++;
            this._hideButtons();
        } else {
            alert("Numero maximo de opção")
        }
    }

    _reorderList(event) {
        event.preventDefault();

        Array.from(document.querySelectorAll(".dynamic-div")).forEach((div, indice) => {
            Array.from(div.querySelectorAll("input, select")).forEach(input => {
                let name = input.name;
                let newName = name.replace(/\[\d]./, "[" + indice + "].");

                input.setAttribute("name", newName);
            });
        });
        event.target.submit();
    }

    refreshListeners() {
        window.addEventListener("load", () => this._hideButtons());

        this.createNewDivButton.addEventListener("click", (event) => this.createNewDiv(event));
        this.form.addEventListener("submit", (event) => this._reorderList(event));

        Array.from(document.querySelectorAll(".deletar")).forEach(button => this._addDeleteLister(button));
    }
}
