package o00O0OoO;

import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import o000oo0.AbstractC24658OooO0Oo;
import o000oooO.InterfaceC24759OooO0o;
import o00O0O0o.C24834OooO0Oo;
import o00O0O0o.EnumC24833OooO00o;
import o00O0O0o.EnumC24838OooOO0o;

/* JADX INFO: renamed from: o00O0OoO.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24882OooOo0O extends AbstractC24658OooO0Oo<C24880OooOOoo> {
    @Override // Oooo0oO.AbstractC21020OooO00o
    public final String OooOO0() {
        return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x01ab -> B:88:0x01c3). Please report as a decompilation issue!!! */
    @Override // o000oo0.AbstractC24658OooO0Oo
    public final void OooOOO0(InterfaceC24759OooO0o interfaceC24759OooO0o, C24880OooOOoo c24880OooOOoo) throws Throwable {
        int i;
        int i2;
        Throwable th;
        ObjectOutputStream objectOutputStream;
        HashSet<C24834OooO0Oo.OooO00o> hashSet;
        C24880OooOOoo c24880OooOOoo2 = c24880OooOOoo;
        String str = c24880OooOOoo2.f84457OooO00o;
        int i3 = 1;
        if (str == null) {
            interfaceC24759OooO0o.OooO0oO(1);
        } else {
            interfaceC24759OooO0o.OoooOO0(1, str);
        }
        interfaceC24759OooO0o.OooO0o(2, Oooo0.OooO0o(c24880OooOOoo2.f84458OooO0O0));
        String str2 = c24880OooOOoo2.f84459OooO0OO;
        if (str2 == null) {
            interfaceC24759OooO0o.OooO0oO(3);
        } else {
            interfaceC24759OooO0o.OoooOO0(3, str2);
        }
        String str3 = c24880OooOOoo2.f84460OooO0Oo;
        if (str3 == null) {
            interfaceC24759OooO0o.OooO0oO(4);
        } else {
            interfaceC24759OooO0o.OoooOO0(4, str3);
        }
        byte[] bArrOooO0OO = androidx.work.OooO0O0.OooO0OO(c24880OooOOoo2.f84462OooO0o0);
        if (bArrOooO0OO == null) {
            interfaceC24759OooO0o.OooO0oO(5);
        } else {
            interfaceC24759OooO0o.OooooO0(5, bArrOooO0OO);
        }
        byte[] bArrOooO0OO2 = androidx.work.OooO0O0.OooO0OO(c24880OooOOoo2.f84461OooO0o);
        if (bArrOooO0OO2 == null) {
            interfaceC24759OooO0o.OooO0oO(6);
        } else {
            interfaceC24759OooO0o.OooooO0(6, bArrOooO0OO2);
        }
        interfaceC24759OooO0o.OooO0o(7, c24880OooOOoo2.f84463OooO0oO);
        interfaceC24759OooO0o.OooO0o(8, c24880OooOOoo2.f84464OooO0oo);
        interfaceC24759OooO0o.OooO0o(9, c24880OooOOoo2.f84456OooO);
        interfaceC24759OooO0o.OooO0o(10, c24880OooOOoo2.f84466OooOO0O);
        EnumC24833OooO00o enumC24833OooO00o = c24880OooOOoo2.f84467OooOO0o;
        int iOrdinal = enumC24833OooO00o.ordinal();
        if (iOrdinal == 0) {
            i = 0;
        } else {
            if (iOrdinal != 1) {
                throw new IllegalArgumentException("Could not convert " + enumC24833OooO00o + " to int");
            }
            i = 1;
        }
        interfaceC24759OooO0o.OooO0o(11, i);
        interfaceC24759OooO0o.OooO0o(12, c24880OooOOoo2.f84469OooOOO0);
        interfaceC24759OooO0o.OooO0o(13, c24880OooOOoo2.f84468OooOOO);
        interfaceC24759OooO0o.OooO0o(14, c24880OooOOoo2.f84470OooOOOO);
        interfaceC24759OooO0o.OooO0o(15, c24880OooOOoo2.f84471OooOOOo);
        interfaceC24759OooO0o.OooO0o(16, c24880OooOOoo2.f84473OooOOo0 ? 1L : 0L);
        o00O0O0o.OooOOOO oooOOOO = c24880OooOOoo2.f84472OooOOo;
        int iOrdinal2 = oooOOOO.ordinal();
        if (iOrdinal2 == 0) {
            i2 = 0;
        } else {
            if (iOrdinal2 != 1) {
                throw new IllegalArgumentException("Could not convert " + oooOOOO + " to int");
            }
            i2 = 1;
        }
        interfaceC24759OooO0o.OooO0o(17, i2);
        o00O0O0o.OooO0OO oooO0OO = c24880OooOOoo2.f84465OooOO0;
        if (oooO0OO == null) {
            interfaceC24759OooO0o.OooO0oO(18);
            interfaceC24759OooO0o.OooO0oO(19);
            interfaceC24759OooO0o.OooO0oO(20);
            interfaceC24759OooO0o.OooO0oO(21);
            interfaceC24759OooO0o.OooO0oO(22);
            interfaceC24759OooO0o.OooO0oO(23);
            interfaceC24759OooO0o.OooO0oO(24);
            interfaceC24759OooO0o.OooO0oO(25);
            return;
        }
        EnumC24838OooOO0o enumC24838OooOO0o = oooO0OO.f84232OooO00o;
        int iOrdinal3 = enumC24838OooOO0o.ordinal();
        if (iOrdinal3 == 0) {
            i3 = 0;
        } else if (iOrdinal3 != 1) {
            if (iOrdinal3 == 2) {
                i3 = 2;
            } else if (iOrdinal3 == 3) {
                i3 = 3;
            } else if (iOrdinal3 == 4) {
                i3 = 4;
            } else {
                if (Build.VERSION.SDK_INT < 30 || enumC24838OooOO0o != EnumC24838OooOO0o.f84263OooOoo0) {
                    throw new IllegalArgumentException("Could not convert " + enumC24838OooOO0o + " to int");
                }
                i3 = 5;
            }
        }
        interfaceC24759OooO0o.OooO0o(18, i3);
        interfaceC24759OooO0o.OooO0o(19, oooO0OO.f84233OooO0O0 ? 1L : 0L);
        interfaceC24759OooO0o.OooO0o(20, oooO0OO.f84234OooO0OO ? 1L : 0L);
        interfaceC24759OooO0o.OooO0o(21, oooO0OO.f84235OooO0Oo ? 1L : 0L);
        interfaceC24759OooO0o.OooO0o(22, oooO0OO.f84237OooO0o0 ? 1L : 0L);
        interfaceC24759OooO0o.OooO0o(23, oooO0OO.f84236OooO0o);
        interfaceC24759OooO0o.OooO0o(24, oooO0OO.f84238OooO0oO);
        C24834OooO0Oo c24834OooO0Oo = oooO0OO.f84239OooO0oo;
        byte[] byteArray = null;
        objectOutputStream = null;
        ObjectOutputStream objectOutputStream2 = null;
        if (c24834OooO0Oo.f84240OooO00o.size() != 0) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                try {
                    try {
                        objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                        hashSet = c24834OooO0Oo.f84240OooO00o;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                objectOutputStream.writeInt(hashSet.size());
                for (C24834OooO0Oo.OooO00o oooO00o : hashSet) {
                    objectOutputStream.writeUTF(oooO00o.f84241OooO00o.toString());
                    objectOutputStream.writeBoolean(oooO00o.f84242OooO0O0);
                }
                try {
                    objectOutputStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
                byteArrayOutputStream.close();
            } catch (IOException e4) {
                e = e4;
                objectOutputStream2 = objectOutputStream;
                e.printStackTrace();
                if (objectOutputStream2 != null) {
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th = th3;
                objectOutputStream2 = objectOutputStream;
                if (objectOutputStream2 != null) {
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                try {
                    byteArrayOutputStream.close();
                    throw th;
                } catch (IOException e7) {
                    e7.printStackTrace();
                    throw th;
                }
            }
            byteArray = byteArrayOutputStream.toByteArray();
        }
        if (byteArray == null) {
            interfaceC24759OooO0o.OooO0oO(25);
        } else {
            interfaceC24759OooO0o.OooooO0(25, byteArray);
        }
    }
}
