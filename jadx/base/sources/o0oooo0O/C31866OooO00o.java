package o0oooo0O;

import android.content.SharedPreferences;
import android.util.Log;
import com.huawei.hms.network.embedded.C18115b5;
import com.xiaomi.account.privacy_data.bluetooth_address.BluetoothAddressGetter;
import com.xiaomi.account.privacy_data.bluetooth_name.BluetoothNameGetter;
import com.xiaomi.account.privacy_data.bssid.BSSIDGetter;
import com.xiaomi.account.privacy_data.configured_ssids.ConfiguredSSIDsGetter;
import com.xiaomi.account.privacy_data.iccid.ICCIDGetter;
import com.xiaomi.account.privacy_data.imsi.IMSIGetter;
import com.xiaomi.account.privacy_data.line_1_number.Line1NumberGetter;
import com.xiaomi.account.privacy_data.mac_address.MacAddressGetter;
import com.xiaomi.account.privacy_data.mccmnc.MCCMNCGetter;
import com.xiaomi.account.privacy_data.miui_device_id.MiuiDeviceIdGetter;
import com.xiaomi.account.privacy_data.mobile_data_enable.MobileDataEnableGetter;
import com.xiaomi.account.privacy_data.network_mccmnc.NetworkMCCMNCGetter;
import com.xiaomi.account.privacy_data.oaid.OAIDGetter;
import com.xiaomi.account.privacy_data.ssid.SSIDGetter;
import com.xiaomi.account.privacy_data.sub_id.SubIdGetter;
import java.util.HashMap;
import o0oooOo.AbstractActivityC31852OooO0O0;
import o0oooOoO.C31861OooO00o;
import o0oooo0.C31864OooO0O0;
import o0oooo0.InterfaceC31863OooO00o;
import o0oooo00.C31865OooO00o;

/* JADX INFO: renamed from: o0oooo0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31866OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final HashMap f113564OooO00o;

    static {
        HashMap map = new HashMap();
        f113564OooO00o = map;
        try {
            map.put("oaid", new OAIDGetter());
        } catch (NoClassDefFoundError unused) {
            Log.e("PrivacyDataMaster", "OAID privacy-data-getter not defined");
        }
        try {
            f113564OooO00o.put("android_id", new C31861OooO00o());
        } catch (NoClassDefFoundError unused2) {
            Log.e("PrivacyDataMaster", "ANDROID_ID privacy-data-getter not defined");
        }
        try {
            f113564OooO00o.put(C18115b5.DEVICE_ID, new C31865OooO00o());
        } catch (NoClassDefFoundError unused3) {
            Log.e("PrivacyDataMaster", "device-id privacy-data-getter not defined");
        }
        try {
            f113564OooO00o.put("miui_device_id", new MiuiDeviceIdGetter());
        } catch (NoClassDefFoundError unused4) {
            Log.e("PrivacyDataMaster", "miui-device-id privacy-data-getter not defined");
        }
        try {
            f113564OooO00o.put("bluetooth_name", new BluetoothNameGetter());
        } catch (NoClassDefFoundError unused5) {
            Log.e("PrivacyDataMaster", "bluetooth-data bluetooth-name-getter not defined");
        }
        try {
            f113564OooO00o.put("bluetooth_address", new BluetoothAddressGetter());
        } catch (NoClassDefFoundError unused6) {
            Log.e("PrivacyDataMaster", "bluetooth-data bluetooth-address-getter not defined");
        }
        try {
            f113564OooO00o.put("mac_address", new MacAddressGetter());
        } catch (NoClassDefFoundError unused7) {
            Log.e("PrivacyDataMaster", "bluetooth-data mac-address-getter not defined");
        }
        try {
            f113564OooO00o.put("ssid", new SSIDGetter());
        } catch (NoClassDefFoundError unused8) {
            Log.e("PrivacyDataMaster", "bluetooth-data ssid-getter not defined");
        }
        try {
            f113564OooO00o.put("bssid", new BSSIDGetter());
        } catch (NoClassDefFoundError unused9) {
            Log.e("PrivacyDataMaster", "bluetooth-data bssid-getter not defined");
        }
        try {
            f113564OooO00o.put("configured_ssids", new ConfiguredSSIDsGetter());
        } catch (NoClassDefFoundError unused10) {
            Log.e("PrivacyDataMaster", "bluetooth-data configured-ssids-getter not defined");
        }
        try {
            f113564OooO00o.put("iccid", new ICCIDGetter());
        } catch (NoClassDefFoundError unused11) {
            Log.e("PrivacyDataMaster", "bluetooth-data iccid-getter not defined");
        }
        try {
            f113564OooO00o.put("imsi", new IMSIGetter());
        } catch (NoClassDefFoundError unused12) {
            Log.e("PrivacyDataMaster", "bluetooth-data imsi-getter not defined");
        }
        try {
            f113564OooO00o.put("line_1_number", new Line1NumberGetter());
        } catch (NoClassDefFoundError unused13) {
            Log.e("PrivacyDataMaster", "bluetooth-data line-1-number-getter not defined");
        }
        try {
            f113564OooO00o.put("mccmnc", new MCCMNCGetter());
        } catch (NoClassDefFoundError unused14) {
            Log.e("PrivacyDataMaster", "bluetooth-data mccmnc-getter not defined");
        }
        try {
            f113564OooO00o.put("network_mccmnc", new NetworkMCCMNCGetter());
        } catch (NoClassDefFoundError unused15) {
            Log.e("PrivacyDataMaster", "bluetooth-data network-mccmnc-getter not defined");
        }
        try {
            f113564OooO00o.put("sub_id", new SubIdGetter());
        } catch (NoClassDefFoundError unused16) {
            Log.e("PrivacyDataMaster", "bluetooth-data sub-id-getter not defined");
        }
        try {
            f113564OooO00o.put("mobile_data_enable", new MobileDataEnableGetter());
        } catch (NoClassDefFoundError unused17) {
            Log.e("PrivacyDataMaster", "bluetooth-data mobile-data-enable-getter not defined");
        }
    }

    public static String OooO00o(AbstractActivityC31852OooO0O0 abstractActivityC31852OooO0O0, int i, String... strArr) {
        String str;
        switch (i) {
            case 1:
                str = "oaid";
                break;
            case 2:
                str = "android_id";
                break;
            case 3:
                str = C18115b5.DEVICE_ID;
                break;
            case 4:
                str = "miui_device_id";
                break;
            case 5:
                str = "bluetooth_name";
                break;
            case 6:
                str = "bluetooth_address";
                break;
            case 7:
                str = "mac_address";
                break;
            case 8:
                str = "ssid";
                break;
            case 9:
                str = "bssid";
                break;
            case 10:
                str = "configured_ssids";
                break;
            case 11:
                str = "iccid";
                break;
            case 12:
                str = "imsi";
                break;
            case 13:
                str = "line_1_number";
                break;
            case 14:
                str = "mccmnc";
                break;
            case 15:
                str = "network_mccmnc";
                break;
            case 16:
                str = "sub_id";
                break;
            case 17:
                str = "mobile_data_enable";
                break;
            default:
                throw null;
        }
        SharedPreferences sharedPreferences = abstractActivityC31852OooO0O0.getSharedPreferences("com.xiaomi.account.privacy_data.master.data", 0);
        String str2 = null;
        String string = sharedPreferences.getString(str, null);
        if (string != null) {
            Log.e("PrivacyDataMaster", "read privacy data from local cache for type: ".concat(str));
            return string;
        }
        InterfaceC31863OooO00o interfaceC31863OooO00o = (InterfaceC31863OooO00o) f113564OooO00o.get(str);
        if (interfaceC31863OooO00o == null) {
            Log.e("PrivacyDataMaster", "no privacy data getter for type: ".concat(str));
        } else {
            try {
                String strOooO00o = interfaceC31863OooO00o.OooO00o(abstractActivityC31852OooO0O0);
                abstractActivityC31852OooO0O0.getSharedPreferences("com.xiaomi.account.privacy_data.master.data", 0).edit().putString(str, strOooO00o).commit();
                str2 = strOooO00o;
            } catch (C31864OooO0O0 e) {
                Log.e("PrivacyDataMaster", "get privacy data failed for type: ".concat(str), e);
            } catch (Exception e2) {
                Log.e("PrivacyDataMaster", "unknown error: get privacy data failed for type: ".concat(str), e2);
            }
        }
        if (str2 != null) {
            sharedPreferences.edit().putString(str, str2).commit();
            Log.e("PrivacyDataMaster", "get privacy data success and cache for type: ".concat(str));
        }
        return str2;
    }
}
