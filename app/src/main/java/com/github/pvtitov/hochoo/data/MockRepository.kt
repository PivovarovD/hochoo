package com.github.pvtitov.hochoo.data

import com.github.pvtitov.hochoo.domain.contract.data.Repository
import com.github.pvtitov.hochoo.domain.model.Wish
import com.github.pvtitov.hochoo.domain.model.Person
import io.reactivex.Observable
import io.reactivex.Single
import java.util.function.Predicate

class MockRepository: Repository {

    val personList = mutableListOf<Person>()

    init {
        val p1 = Person("123")
    }

    override fun getPerson(id: String): Single<Person> {
        return Single.fromCallable { personList.find { it.id == id }
            ?: throw IllegalArgumentException("Can't find person by ID {id}") }
    }

    override fun searchForPerson(predicate: Predicate<Person>): Observable<Person> {
        return Observable.fromIterable(personList.filter { predicate.test(it) })
    }

    override fun findGift(id: String): Single<Wish> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun searchForGift(predicate: Predicate<Wish>): Observable<Wish> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createPerson(person: Person): Single<Boolean> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun editPerson(givenPerson: Person, alteredPerson: Person): Single<Boolean> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deletePerson(person: Person): Single<Boolean> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createGift(wish: Wish): Single<Boolean> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun editGift(givenWish: Wish, alteredWish: Wish): Single<Boolean> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteGift(wish: Wish): Single<Boolean> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun pretendToDoHardJob() {
        Thread.sleep(1000)
    }
}