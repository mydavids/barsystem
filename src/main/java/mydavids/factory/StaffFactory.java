package mydavids.factory;

import mydavids.domain.Staff;

import java.util.Map;

/**
 * Created by Yusiry on 8/20/2016.
 */
public class StaffFactory {

    public static Staff createStaffMember(Map<String, String> values){

        Staff staff = new Staff.Builder().name(values.get("name"))
                .idNumber(values.get("idNumber")).password(values.get("password")).surname(values.get("surname"))
                .build();

        return staff;
    }

}
