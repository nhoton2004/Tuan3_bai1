package com.example.tuan3_bai1.navigation
sealed class Screen(val route: String) {
    object Splash : Screen("splash")
    object ComponentsList : Screen("components_list")
    object TextDetail : Screen("text_detail")
    object ImageDetail : Screen("image_detail")
    object TextFieldDetail : Screen("textfield_detail")
    object PasswordFieldDetail : Screen("passwordfield_detail")
    object ColumnDetail : Screen("column_detail")
    object RowDetail : Screen("row_detail")
}