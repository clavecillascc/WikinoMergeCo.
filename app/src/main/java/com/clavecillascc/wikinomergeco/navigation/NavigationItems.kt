package com.clavecillascc.wikinomergeco.navigation


import com.clavecillascc.wikinomergeco.R

sealed class NavigationItems(var route: String, var icon: Int, var title: String) {
    object Home : NavigationItems("home", R.drawable.home, "Home")
    object Translate : NavigationItems("translate", R.drawable.translate, "Translate")
    object Library : NavigationItems("library", R.drawable.library, "Library")
    object Collaborator : NavigationItems("collaborator", R.drawable.collaboration, "Collaborator")
    object About : NavigationItems("about", R.drawable.about, "About")
}