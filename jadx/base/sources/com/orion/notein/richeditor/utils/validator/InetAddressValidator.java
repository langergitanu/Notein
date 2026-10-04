package com.orion.notein.richeditor.utils.validator;

import com.huawei.hms.network.embedded.C18241k5;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public class InetAddressValidator implements Serializable {
    private static final String IPV4_REGEX = "^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$";
    private static final InetAddressValidator VALIDATOR = new InetAddressValidator();
    private static final long serialVersionUID = -919201640201914789L;
    private final RegexValidator ipv4Validator = new RegexValidator(IPV4_REGEX);

    public static InetAddressValidator getInstance() {
        return VALIDATOR;
    }

    public boolean isValid(String str) {
        return isValidInet4Address(str) || isValidInet6Address(str);
    }

    public boolean isValidInet4Address(String str) {
        String[] strArrMatch = this.ipv4Validator.match(str);
        if (strArrMatch == null) {
            return false;
        }
        for (int i = 0; i <= 3; i++) {
            String str2 = strArrMatch[i];
            if (str2 != null && str2.length() != 0) {
                try {
                    if (Integer.parseInt(str2) > 255) {
                        return false;
                    }
                    if (str2.length() > 1 && str2.startsWith("0")) {
                        return false;
                    }
                } catch (NumberFormatException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public boolean isValidInet6Address(String str) {
        int iIntValue;
        boolean z = str.indexOf("::") > -1;
        if (z && str.indexOf("::") != str.lastIndexOf("::")) {
            return false;
        }
        if ((str.startsWith(C18241k5.f55433h) && !str.startsWith("::")) || (str.endsWith(C18241k5.f55433h) && !str.endsWith("::"))) {
            return false;
        }
        Object[] objArrSplit = str.split(C18241k5.f55433h);
        if (z) {
            ArrayList arrayList = new ArrayList(Arrays.asList(objArrSplit));
            if (str.endsWith("::")) {
                arrayList.add("");
            } else if (str.startsWith("::") && !arrayList.isEmpty()) {
                arrayList.remove(0);
            }
            objArrSplit = arrayList.toArray();
        }
        if (objArrSplit.length > 8) {
            return false;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < objArrSplit.length; i3++) {
            String str2 = (String) objArrSplit[i3];
            if (str2.length() == 0) {
                i2++;
                if (i2 > 1) {
                    return false;
                }
            } else if (str2.indexOf(".") > -1) {
                if (!str.endsWith(str2) || i3 > objArrSplit.length - 1 || i3 > 6 || !isValidInet4Address(str2)) {
                    return false;
                }
                i += 2;
                i2 = 0;
            } else {
                if (str2.length() > 4) {
                    return false;
                }
                try {
                    iIntValue = Integer.valueOf(str2, 16).intValue();
                } catch (NumberFormatException unused) {
                }
                if (iIntValue < 0 || iIntValue > 65535) {
                    return false;
                }
                i2 = 0;
            }
            i++;
        }
        return i >= 8 || z;
    }
}
