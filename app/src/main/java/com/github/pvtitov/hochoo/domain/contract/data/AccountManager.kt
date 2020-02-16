package com.github.pvtitov.hochoo.domain.contract.data

import com.github.pvtitov.hochoo.domain.model.Account
import io.reactivex.Single

interface AccountManager {
    fun authenticate(account: Account): Single<String>
    fun authorize(token: String): Single<Boolean>
    fun create(account: Account): Single<Boolean>
    fun edit(givenAccount: Account, alteredAccount: Account): Single<Boolean>
    fun delete(account: Account): Single<Boolean>
}