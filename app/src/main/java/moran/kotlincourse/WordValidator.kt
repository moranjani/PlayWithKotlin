package moran.kotlincourse

import android.text.TextUtils

class WordValidator {
    fun isValidIdentifier(s: String): Boolean =
        when {
            TextUtils.isEmpty(s) ->  false
            isFirstLetterValid(s[0]) && isOtherLettersValid(s) -> true
            else -> false
        }

    private fun isFirstLetterValid(c: Char) : Boolean {
        return isValidLetter(c) && !isNumber(c)
    }

    private fun isOtherLettersValid(s: String) : Boolean {
        for (c :Char in s.drop(1) ) {
            if (!isValidLetter(c)) return false
        }
        return true
    }

    private fun isValidLetter(c: Char) : Boolean {
        return isLetter(c) || isNumber(c) || c=='_'
    }

    private fun isLetter(c: Char): Boolean {
        return c in ('a'..'z') || c in ('A'..'Z')
    }

    private fun isNumber(c: Char) :Boolean {
        return c in ('0'..'9')
    }
}







