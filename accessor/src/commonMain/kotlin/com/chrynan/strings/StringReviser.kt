package com.chrynan.strings

interface StringReviser : StringAccessor {

    fun updateStaticString(resourceID: StringResourceID, locale: String, value: String)

    fun updateDynamicString(resourceID: DynamicStringResourceID, locale: String, value: String)

    fun updateHtmlString(resourceID: HtmlStringResourceID, locale: String, value: String)

    fun updateStringArray(resourceID: StringArrayResourceID, locale: String, value: Array<String>)

    fun updatePluralStrings(resourceID: PluralStringResourceID, locale: String, values: Map<Quantity, String>)
}