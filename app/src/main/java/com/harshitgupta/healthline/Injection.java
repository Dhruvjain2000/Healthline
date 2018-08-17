package com.harshitgupta.healthline;

import android.content.Context;
import android.support.annotation.NonNull;

import com.harshitgupta.healthline.data.source.MedicineRepository;
import com.harshitgupta.healthline.data.source.local.MedicinesLocalDataSource;
import com.harshitgupta.healthline.data.source.MedicineRepository;
import com.harshitgupta.healthline.data.source.local.MedicinesLocalDataSource;


public class Injection {

    public static MedicineRepository provideMedicineRepository(@NonNull Context context) {
        return MedicineRepository.getInstance(MedicinesLocalDataSource.getInstance(context));
    }
}
