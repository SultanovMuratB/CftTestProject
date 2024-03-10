package com.sultanov.cfttestproject.data.users.domain

import android.os.Parcel
import android.os.Parcelable
import java.io.Serializable

internal data class User(
    val gender: String? = null,
    val name: Name,
    val location: Location,
    val email: String? = null,
    val login: Login,
    val dob: Dob,
    val registered: Registered,
    val phone: String? = null,
    val cell: String? = null,
    val id: Id,
    val picture: Picture,
    val nat: String? = null,
) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString(),
        TODO("name"),
        TODO("location"),
        parcel.readString(),
        TODO("login"),
        TODO("dob"),
        TODO("registered"),
        parcel.readString(),
        parcel.readString(),
        TODO("id"),
        TODO("picture"),
        parcel.readString()
    ) {
    }

    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(p0: Parcel, p1: Int) {
        TODO("Not yet implemented")
    }

    companion object CREATOR : Parcelable.Creator<User> {
        override fun createFromParcel(parcel: Parcel): User {
            return User(parcel)
        }

        override fun newArray(size: Int): Array<User?> {
            return arrayOfNulls(size)
        }
    }

}

internal data class Picture(
    val large: String? = null,
    val medium: String? = null,
    val thumbnail: String? = null,
)

internal data class Id(
    val name: String? = null,
    val value: String? = null,
)

internal data class Registered(
    val date: String? = null,
    val age: String? = null,
)

internal data class Dob(
    val date: String? = null,
    val age: String? = null,
)

internal data class Login(
    val uuid: String? = null,
    val username: String? = null,
    val password: String? = null,
    val salt: String? = null,
    val md5: String? = null,
    val sha1: String? = null,
    val sha256: String? = null,
)

internal data class Location(
    val street: Street,
    val city: String? = null,
    val state: String? = null,
    val country: String? = null,
    val postcode: String? = null,
    val coordinates: Coordinates,
    val timezone: Timezone,
)

internal data class Timezone(
    val offset: String? = null,
    val description: String? = null,
)

internal data class Coordinates(
    val latitude: String? = null,
    val longitude: String? = null,
)

internal data class Street(
    val number: String? = null,
    val name: String? = null,
)

internal data class Name(
    val title: String? = null,
    val first: String? = null,
    val last: String? = null,
)