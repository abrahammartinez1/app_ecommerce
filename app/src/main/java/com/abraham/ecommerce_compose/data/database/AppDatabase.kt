package com.abraham.ecommerce_compose.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.abraham.ecommerce_compose.domain.entity.cart.UserCartEntity
import com.abraham.ecommerce_compose.domain.entity.product.FavoriteProductEntity

@Database(entities = [UserCartEntity::class, FavoriteProductEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun appDao(): AppDao
}
