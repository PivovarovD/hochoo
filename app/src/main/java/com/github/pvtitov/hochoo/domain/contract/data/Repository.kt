package com.github.pvtitov.hochoo.domain.contract.data

import com.github.pvtitov.hochoo.domain.model.Wish
import com.github.pvtitov.hochoo.domain.model.Person
import io.reactivex.Observable
import io.reactivex.Single
import java.util.function.Predicate

interface Repository {

    fun getPerson(id: String): Single<Person>
    fun searchForPerson(predicate: Predicate<Person>): Observable<Person>

    fun findGift(id: String): Single<Wish>
    fun searchForGift(predicate: Predicate<Wish>): Observable<Wish>

    fun createPerson(person: Person): Single<Boolean>
    fun editPerson(givenPerson: Person, alteredPerson: Person): Single<Boolean>
    fun deletePerson(person: Person): Single<Boolean>

    fun createGift(wish: Wish): Single<Boolean>
    fun editGift(givenWish: Wish, alteredWish: Wish): Single<Boolean>
    fun deleteGift(wish: Wish): Single<Boolean>
}