package o00OooOO;

import android.graphics.Bitmap;
import com.aspose.slides.C22218Oooo;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import o00O0oOo.AbstractC24958OooOO0o;
import o00o0O0.C25316OooOO0o;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Bitmap.Config[] f85645OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Bitmap.Config[] f85646OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Bitmap.Config[] f85647OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Bitmap.Config[] f85648OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final Bitmap.Config[] f85649OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO f85650OooO00o = new OooO0OO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25158OooO0o0<OooO0O0, Bitmap> f85651OooO0O0 = new C25158OooO0o0<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f85652OooO0OO = new HashMap();

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f85653OooO00o;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f85653OooO00o = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f85653OooO00o[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f85653OooO00o[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f85653OooO00o[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class OooO0O0 implements OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0OO f85654OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f85655OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Bitmap.Config f85656OooO0OO;

        public OooO0O0(OooO0OO oooO0OO) {
            this.f85654OooO00o = oooO0OO;
        }

        @Override // o00OooOO.OooO
        public final void OooO00o() {
            this.f85654OooO00o.OooO00o(this);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof OooO0O0) {
                OooO0O0 oooO0O0 = (OooO0O0) obj;
                if (this.f85655OooO0O0 == oooO0O0.f85655OooO0O0 && C25316OooOO0o.OooO0O0(this.f85656OooO0OO, oooO0O0.f85656OooO0OO)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = this.f85655OooO0O0 * 31;
            Bitmap.Config config = this.f85656OooO0OO;
            return i + (config != null ? config.hashCode() : 0);
        }

        public final String toString() {
            return OooOO0.OooO0OO(this.f85655OooO0O0, this.f85656OooO0OO);
        }
    }

    public static class OooO0OO extends AbstractC24958OooOO0o {
        public final OooO OooO() {
            return new OooO0O0(this);
        }
    }

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f85645OooO0Oo = configArr;
        f85647OooO0o0 = configArr;
        f85646OooO0o = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f85648OooO0oO = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f85649OooO0oo = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String OooO0OO(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final void OooO00o(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> navigableMapOooO0Oo = OooO0Oo(bitmap.getConfig());
        Integer num2 = navigableMapOooO0Oo.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapOooO0Oo.remove(num);
                return;
            } else {
                navigableMapOooO0Oo.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + OooO0OO(C25316OooOO0o.OooO0OO(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    public final Bitmap OooO0O0(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iOooO0Oo = C25316OooOO0o.OooO0Oo(config) * i * i2;
        OooO0OO oooO0OO = this.f85650OooO00o;
        OooO OooO2 = (OooO) ((ArrayDeque) oooO0OO.f84649OooOo).poll();
        if (OooO2 == null) {
            OooO2 = oooO0OO.OooO();
        }
        OooO0O0 oooO0O0 = (OooO0O0) OooO2;
        oooO0O0.f85655OooO0O0 = iOooO0Oo;
        oooO0O0.f85656OooO0OO = config;
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = f85647OooO0o0;
        } else {
            int i3 = OooO00o.f85653OooO00o[config.ordinal()];
            configArr = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? new Bitmap.Config[]{config} : f85649OooO0oo : f85648OooO0oO : f85646OooO0o : f85645OooO0Oo;
        }
        int length = configArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i4];
            Integer numCeilingKey = OooO0Oo(config2).ceilingKey(Integer.valueOf(iOooO0Oo));
            if (numCeilingKey == null || numCeilingKey.intValue() > iOooO0Oo * 8) {
                i4++;
            } else if (numCeilingKey.intValue() != iOooO0Oo || (config2 != null ? !config2.equals(config) : config != null)) {
                oooO0OO.OooO00o(oooO0O0);
                int iIntValue = numCeilingKey.intValue();
                OooO OooO3 = (OooO) ((ArrayDeque) oooO0OO.f84649OooOo).poll();
                if (OooO3 == null) {
                    OooO3 = oooO0OO.OooO();
                }
                oooO0O0 = (OooO0O0) OooO3;
                oooO0O0.f85655OooO0O0 = iIntValue;
                oooO0O0.f85656OooO0OO = config2;
            }
        }
        Bitmap bitmapOooO00o = this.f85651OooO0O0.OooO00o(oooO0O0);
        if (bitmapOooO00o != null) {
            OooO00o(Integer.valueOf(oooO0O0.f85655OooO0O0), bitmapOooO00o);
            bitmapOooO00o.reconfigure(i, i2, config);
        }
        return bitmapOooO00o;
    }

    public final NavigableMap<Integer, Integer> OooO0Oo(Bitmap.Config config) {
        HashMap map = this.f85652OooO0OO;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    public final void OooO0o0(Bitmap bitmap) {
        int iOooO0OO = C25316OooOO0o.OooO0OO(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        OooO0OO oooO0OO = this.f85650OooO00o;
        OooO OooO2 = (OooO) ((ArrayDeque) oooO0OO.f84649OooOo).poll();
        if (OooO2 == null) {
            OooO2 = oooO0OO.OooO();
        }
        OooO0O0 oooO0O0 = (OooO0O0) OooO2;
        oooO0O0.f85655OooO0O0 = iOooO0OO;
        oooO0O0.f85656OooO0OO = config;
        this.f85651OooO0O0.OooO0O0(oooO0O0, bitmap);
        NavigableMap<Integer, Integer> navigableMapOooO0Oo = OooO0Oo(bitmap.getConfig());
        Integer num = navigableMapOooO0Oo.get(Integer.valueOf(oooO0O0.f85655OooO0O0));
        navigableMapOooO0Oo.put(Integer.valueOf(oooO0O0.f85655OooO0O0), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO("SizeConfigStrategy{groupedMap=");
        sbOooO0OO.append(this.f85651OooO0O0);
        sbOooO0OO.append(", sortedSizes=(");
        HashMap map = this.f85652OooO0OO;
        for (Map.Entry entry : map.entrySet()) {
            sbOooO0OO.append(entry.getKey());
            sbOooO0OO.append('[');
            sbOooO0OO.append(entry.getValue());
            sbOooO0OO.append("], ");
        }
        if (!map.isEmpty()) {
            sbOooO0OO.replace(sbOooO0OO.length() - 2, sbOooO0OO.length(), "");
        }
        sbOooO0OO.append(")}");
        return sbOooO0OO.toString();
    }
}
