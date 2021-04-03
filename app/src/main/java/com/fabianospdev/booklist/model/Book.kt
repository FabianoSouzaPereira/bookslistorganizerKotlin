package com.fabianospdev.booklist.model

data class Book(
    private val mCode: Int? = 0,
    private val mTitle: String? = "",
    private val mAuthor: String? = "",
    private val mIlustrator: String? = "",
    private val mCover: String? = "",
    private val mEdition: String? = "", // editor /local de edição /data de edição
    private val mPrint: String? = "",
    private val mFineshing: String? = "",
    private val mDate: String? = "",
    private val mLegaldeposit: String? = "", // depósito legal - lei (Portugal)
    private val mIsbn: String? = "",
    private val mEmail: String? = ""
)
