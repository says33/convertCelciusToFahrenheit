package com.mx

class BreadCrumbTagLib {

    static namespace = "brcr"

    def breadCrumb = {
        out << "<a href='${request.getContextPath()}'>Home</a>"

        if (controllerName)
            out << " -> <a href='${request.getContextPath()}/${controllerName}'>  ${controllerName}</a>"

        if (actionName)
            out << " -> ${actionName} "
    }

}
