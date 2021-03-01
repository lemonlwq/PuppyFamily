/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.data.Dog

class MainViewModel : ViewModel() {
    var currentDog: Dog? by mutableStateOf(null)

    val dogs by mutableStateOf(
        listOf(
            Dog(
                "Alice", "Afghan Hound", "Afghan",
                "5", "Female", "Large", R.drawable.img_puppy_alice
            ),
            Dog(
                "Amy", "Bernese Mountain", "Switzerland",
                "4", "Male", "Large", R.drawable.img_puppy_amy
            ),
            Dog(
                "Barbara", "Pomeranian", "Germany",
                "2", "Female", "Small", R.drawable.img_puppy_barbara
            ),
            Dog(
                "Bonie", "Basset Hound", "UK",
                "2", "Female", "Medium", R.drawable.img_puppy_bonie
            ),
            Dog(
                "Iris", "Belgian Shepherd", "Belgian",
                "3", "Male", "Large", R.drawable.img_puppy_iris
            ),
            Dog(
                "Katrina", "Caucasian Ovchar", "Russia",
                "5", "Male", "Large", R.drawable.img_puppy_katrina
            ),
            Dog(
                "Kitty", "Miniature Schnauzer", "Germany",
                "4", "Female", "Small", R.drawable.img_puppy_kitty
            ),
            Dog(
                "Maggie", "Border Collie", "Scotland",
                "3", "Female", "Medium", R.drawable.img_puppy_maggie
            ),
            Dog(
                "Momo", "French Bulldog", "French",
                "2", "Female", "Small", R.drawable.img_puppy_momo
            ),
            Dog(
                "Sunny", "Bichon Frise", "French",
                "2", "Male", "Small", R.drawable.img_puppy_sunny
            ),
            Dog(
                "Yuki", "Pug", "China",
                "3", "Male", "Small", R.drawable.img_puppy_yuki
            ),
        )
    )

    fun gotoDetail(dog: Dog) {
        currentDog = dog
    }

    fun closeDetail() {
        currentDog = null
    }
}
