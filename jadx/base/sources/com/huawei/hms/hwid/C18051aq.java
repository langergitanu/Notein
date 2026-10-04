package com.huawei.hms.hwid;

import android.text.TextUtils;
import com.huawei.hms.framework.common.EmuiUtil;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: com.huawei.hms.hwid.aq */
/* JADX INFO: loaded from: classes8.dex */
public class C18051aq {

    /* JADX INFO: renamed from: a */
    private static int f53962a = -1;

    /* JADX INFO: renamed from: b */
    private static int f53963b;

    static {
        m77652b();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m77651a() {
        return f53963b >= 21;
    }

    /* JADX INFO: renamed from: b */
    private static void m77652b() {
        int iM77654d = m77654d();
        f53963b = iM77654d;
        if (iM77654d >= 17) {
            f53962a = 90;
        }
        if (iM77654d >= 11) {
            f53962a = 50;
        } else if (iM77654d >= 10) {
            f53962a = 41;
        } else if (iM77654d >= 9) {
            f53962a = 40;
        } else if (iM77654d >= 8) {
            f53962a = 31;
        } else if (iM77654d >= 7) {
            f53962a = 30;
        }
        if (f53962a == -1) {
            m77653c();
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m77653c() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getDeclaredMethod("get", String.class).invoke(cls, "ro.build.version.emui");
            if (str != null) {
                if (str.contains("EmotionUI_3.0")) {
                    f53962a = 30;
                    return;
                }
                if (str.contains("EmotionUI_3.1")) {
                    f53962a = 31;
                    return;
                }
                if (str.contains("EmotionUI_4.0")) {
                    f53962a = 40;
                } else if (str.contains("EmotionUI_4.1")) {
                    f53962a = 41;
                } else if (str.contains("EmotionUI_5.0")) {
                    f53962a = 50;
                }
            }
        } catch (RuntimeException unused) {
            C18053as.m77661d("EmuiUtil", "RuntimeException getEmuiType.", true);
        } catch (Exception unused2) {
            C18053as.m77661d("EmuiUtil", "getEmuiType Exception.", true);
        }
    }

    /* JADX INFO: renamed from: d */
    private static int m77654d() {
        Object objM77656a = a.m77656a(EmuiUtil.BUILDEX_VERSION, EmuiUtil.EMUI_SDK_INT);
        if (objM77656a != null) {
            try {
                f53963b = ((Integer) objM77656a).intValue();
            } catch (ClassCastException unused) {
                C18053as.m77661d("EmuiUtil", "getEMUIVersionCode is not a number", true);
            }
        }
        return f53963b;
    }

    /* JADX INFO: renamed from: com.huawei.hms.hwid.aq$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static Class<?> m77655a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!EmuiUtil.BUILDEX_VERSION.equals(str) && !EmuiUtil.IMMERSION_STYLE.equals(str)) {
                return null;
            }
            try {
                return Class.forName(str);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: a */
        public static Object m77656a(String str, String str2) {
            Class<?> clsM77655a = m77655a(str);
            if (clsM77655a == null || TextUtils.isEmpty(str2) || !EmuiUtil.BUILDEX_VERSION.equals(str) || !EmuiUtil.EMUI_SDK_INT.equals(str2)) {
                return null;
            }
            try {
                Field declaredField = clsM77655a.getDeclaredField(str2);
                AccessibleObject.setAccessible(new Field[]{declaredField}, true);
                return declaredField.get(clsM77655a);
            } catch (IllegalAccessException unused) {
                C18053as.m77660c("ReflectionUtils", "Exception in getFieldObj :: IllegalAccessException", true);
                return null;
            } catch (IllegalArgumentException unused2) {
                C18053as.m77660c("ReflectionUtils", "Exception in getFieldObj :: IllegalArgumentException", true);
                return null;
            } catch (NoSuchFieldException unused3) {
                C18053as.m77660c("ReflectionUtils", "Exception in getFieldObj :: NoSuchFieldException", true);
                return null;
            } catch (SecurityException unused4) {
                C18053as.m77659b("ReflectionUtils", "not security int method getStaticFieldObj", true);
                return null;
            }
        }
    }
}
