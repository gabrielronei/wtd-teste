class StudentModal {

    constructor() {
        this.modal = document.getElementById("student-confirm-modal");
        this.cancelButton = document.getElementById("student-confirm-modal-cancel");
        this.removeButton = document.getElementById("student-confirm-modal-delete");

        this.setupListeners();
    }

    shouldRemove() {
        this.modal.style.display = "flex";

        return new Promise((resolve, reject) => {
            this.cancelButton.addEventListener("click", () => this._hideModal(resolve, false), {once: true});
            this.removeButton.addEventListener("click", () => this._hideModal(resolve, true), {once: true});
        });
    }

    _hideModal(resolve, returnValue) {
        this.modal.style.display = "none";

        return resolve(returnValue);
    }

    _exitOnEscape(event) {
        if (event.key === 'Escape') {
            this.modal.style.display = "none";
        }
    }

    _exitOnClickOutside(event) {
        if (event.target === this.modal) {
            this.modal.style.display = "none";
        }
    }

    setupListeners() {
        window.addEventListener("keyup", (event) => this._exitOnEscape(event));
        document.addEventListener("click", (event) => this._exitOnClickOutside(event));
    }
}