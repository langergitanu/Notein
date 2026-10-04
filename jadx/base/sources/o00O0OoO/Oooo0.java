package o00O0OoO;

import Oooo0oO.o0Oo0oo;
import android.net.Uri;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import o00O0O0o.C24834OooO0Oo;
import o00O0O0o.C24841OooOOo0;
import o00O0O0o.EnumC24833OooO00o;
import o00O0O0o.EnumC24838OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 {
    /* JADX WARN: Removed duplicated region for block: B:50:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0043 -> B:54:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C24834OooO0Oo OooO00o(byte[] bArr) throws Throwable {
        Throwable th;
        ObjectInputStream objectInputStream;
        IOException e;
        C24834OooO0Oo c24834OooO0Oo = new C24834OooO0Oo();
        if (bArr != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ObjectInputStream objectInputStream2 = null;
            try {
                try {
                    try {
                        objectInputStream = new ObjectInputStream(byteArrayInputStream);
                        try {
                            for (int i = objectInputStream.readInt(); i > 0; i--) {
                                c24834OooO0Oo.f84240OooO00o.add(new C24834OooO0Oo.OooO00o(objectInputStream.readBoolean(), Uri.parse(objectInputStream.readUTF())));
                            }
                            try {
                                objectInputStream.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                            byteArrayInputStream.close();
                        } catch (IOException e3) {
                            e = e3;
                            e.printStackTrace();
                            if (objectInputStream != null) {
                                try {
                                    objectInputStream.close();
                                } catch (IOException e4) {
                                    e4.printStackTrace();
                                }
                            }
                            byteArrayInputStream.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (0 != 0) {
                            try {
                                objectInputStream2.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
                        try {
                            byteArrayInputStream.close();
                            throw th;
                        } catch (IOException e6) {
                            e6.printStackTrace();
                            throw th;
                        }
                    }
                } catch (IOException e7) {
                    objectInputStream = null;
                    e = e7;
                } catch (Throwable th3) {
                    th = th3;
                    if (0 != 0) {
                    }
                    byteArrayInputStream.close();
                    throw th;
                }
            } catch (IOException e8) {
                e8.printStackTrace();
            }
        }
        return c24834OooO0Oo;
    }

    public static EnumC24833OooO00o OooO0O0(int i) {
        if (i == 0) {
            return EnumC24833OooO00o.f84227OooOo0o;
        }
        if (i == 1) {
            return EnumC24833OooO00o.f84226OooOo;
        }
        throw new IllegalArgumentException(o0Oo0oo.OooO0O0(i, "Could not convert ", " to BackoffPolicy"));
    }

    public static EnumC24838OooOO0o OooO0OO(int i) {
        if (i == 0) {
            return EnumC24838OooOO0o.f84258OooOo0o;
        }
        if (i == 1) {
            return EnumC24838OooOO0o.f84257OooOo;
        }
        if (i == 2) {
            return EnumC24838OooOO0o.f84260OooOoO0;
        }
        if (i == 3) {
            return EnumC24838OooOO0o.f84259OooOoO;
        }
        if (i == 4) {
            return EnumC24838OooOO0o.f84261OooOoOO;
        }
        if (Build.VERSION.SDK_INT < 30 || i != 5) {
            throw new IllegalArgumentException(o0Oo0oo.OooO0O0(i, "Could not convert ", " to NetworkType"));
        }
        return EnumC24838OooOO0o.f84263OooOoo0;
    }

    public static o00O0O0o.OooOOOO OooO0Oo(int i) {
        if (i == 0) {
            return o00O0O0o.OooOOOO.f84268OooOo0o;
        }
        if (i == 1) {
            return o00O0O0o.OooOOOO.f84267OooOo;
        }
        throw new IllegalArgumentException(o0Oo0oo.OooO0O0(i, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static int OooO0o(C24841OooOOo0.OooO00o oooO00o) {
        int iOrdinal = oooO00o.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    i = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + oooO00o + " to int");
                    }
                }
            }
        }
        return i;
    }

    public static C24841OooOOo0.OooO00o OooO0o0(int i) {
        if (i == 0) {
            return C24841OooOOo0.OooO00o.f84283OooOo0o;
        }
        if (i == 1) {
            return C24841OooOOo0.OooO00o.f84282OooOo;
        }
        if (i == 2) {
            return C24841OooOOo0.OooO00o.f84285OooOoO0;
        }
        if (i == 3) {
            return C24841OooOOo0.OooO00o.f84284OooOoO;
        }
        if (i == 4) {
            return C24841OooOOo0.OooO00o.f84286OooOoOO;
        }
        if (i == 5) {
            return C24841OooOOo0.OooO00o.f84288OooOoo0;
        }
        throw new IllegalArgumentException(o0Oo0oo.OooO0O0(i, "Could not convert ", " to State"));
    }
}
