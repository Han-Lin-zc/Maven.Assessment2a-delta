package rocks.zipcode.assessment2.objectorientation;

import java.util.Comparator;

public class CompareAddress implements Comparator<Address> {

    @Override
    public int compare(Address address1, Address address2) {

        if (address1.getAddressLine1().equals(address2.getAddressLine1()) &&
            address1.getAddressLine2().equals(address2.getAddressLine2()) &&
            address1.getCity().equals(address2.getCity()) &&
            address1.getState().equals(address2.getState()) &&
            address1.getZipcode().equals(address2.getZipcode()))
            return 0;
        return 0;
    }
}
