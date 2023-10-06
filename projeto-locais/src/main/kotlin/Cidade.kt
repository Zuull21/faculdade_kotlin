class Cidade {

    var nome:String = ""
        set(value) {
            if(value.length >= 3 && value.length <= 20)
        field = value
        }
        get() {
            if (field.isNotBlank()) {
                return field.uppercase()
            } else {
                return "(não informado)"
            }

        }
}