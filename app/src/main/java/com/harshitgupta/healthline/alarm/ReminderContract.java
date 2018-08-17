package com.harshitgupta.healthline.alarm;

import com.harshitgupta.healthline.BasePresenter;
import com.harshitgupta.healthline.BaseView;
import com.harshitgupta.healthline.data.source.History;
import com.harshitgupta.healthline.data.source.MedicineAlarm;


public interface ReminderContract {

    interface View extends BaseView<Presenter> {

        void showMedicine(MedicineAlarm medicineAlarm);

        void showNoData();

        boolean isActive();

        void onFinish();

    }

    interface Presenter extends BasePresenter {

        void finishActivity();

        void onStart(long id);

        void loadMedicineById(long id);

        void addPillsToHistory(History history);

    }
}
