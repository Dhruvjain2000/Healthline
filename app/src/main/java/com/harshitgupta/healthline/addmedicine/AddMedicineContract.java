package com.harshitgupta.healthline.addmedicine;

import com.harshitgupta.healthline.BasePresenter;
import com.harshitgupta.healthline.BaseView;
import com.harshitgupta.healthline.data.source.MedicineAlarm;
import com.harshitgupta.healthline.data.source.Pills;

import java.util.List;


public interface AddMedicineContract {

    interface View extends BaseView<Presenter> {

        void showEmptyMedicineError();

        void showMedicineList();

        boolean isActive();

    }

    interface  Presenter extends BasePresenter{


        void saveMedicine(MedicineAlarm alarm, Pills pills);


        boolean isDataMissing();

        boolean isMedicineExits(String pillName);

        long addPills(Pills pills);

        Pills getPillsByName(String pillName);

        List<MedicineAlarm> getMedicineByPillName(String pillName);

        List<Long> tempIds();

        void deleteMedicineAlarm(long alarmId);

    }
}
