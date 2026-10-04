package oO0OOo0o;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import oO0OOo0o.OooO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final OooO0OO f119523OooOO0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Integer f119524OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C33068OooOOo f119525OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Executor f119526OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AbstractC33059OooO0O0 f119527OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f119528OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final List<OooO.OooO00o> f119529OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Object[][] f119530OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Boolean f119531OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Integer f119532OooO0oo;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public Integer f119533OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public C33068OooOOo f119534OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Executor f119535OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public AbstractC33059OooO0O0 f119536OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f119537OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public List<OooO.OooO00o> f119538OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Object[][] f119539OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Boolean f119540OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Integer f119541OooO0oo;
    }

    public static final class OooO0O0<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f119542OooO00o;

        public OooO0O0(String str) {
            this.f119542OooO00o = str;
        }

        public final String toString() {
            return this.f119542OooO00o;
        }
    }

    static {
        OooO00o oooO00o = new OooO00o();
        oooO00o.f119539OooO0o0 = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        oooO00o.f119538OooO0o = Collections.EMPTY_LIST;
        f119523OooOO0 = new OooO0OO(oooO00o);
    }

    public OooO0OO(OooO00o oooO00o) {
        this.f119525OooO00o = oooO00o.f119534OooO00o;
        this.f119526OooO0O0 = oooO00o.f119535OooO0O0;
        this.f119527OooO0OO = oooO00o.f119536OooO0OO;
        this.f119528OooO0Oo = oooO00o.f119537OooO0Oo;
        this.f119530OooO0o0 = oooO00o.f119539OooO0o0;
        this.f119529OooO0o = oooO00o.f119538OooO0o;
        this.f119531OooO0oO = oooO00o.f119540OooO0oO;
        this.f119532OooO0oo = oooO00o.f119541OooO0oo;
        this.f119524OooO = oooO00o.f119533OooO;
    }

    public static OooO00o OooO0O0(OooO0OO oooO0OO) {
        OooO00o oooO00o = new OooO00o();
        oooO00o.f119534OooO00o = oooO0OO.f119525OooO00o;
        oooO00o.f119535OooO0O0 = oooO0OO.f119526OooO0O0;
        oooO00o.f119536OooO0OO = oooO0OO.f119527OooO0OO;
        oooO00o.f119537OooO0Oo = oooO0OO.f119528OooO0Oo;
        oooO00o.f119539OooO0o0 = oooO0OO.f119530OooO0o0;
        oooO00o.f119538OooO0o = oooO0OO.f119529OooO0o;
        oooO00o.f119540OooO0oO = oooO0OO.f119531OooO0oO;
        oooO00o.f119541OooO0oo = oooO0OO.f119532OooO0oo;
        oooO00o.f119533OooO = oooO0OO.f119524OooO;
        return oooO00o;
    }

    public final <T> T OooO00o(OooO0O0<T> oooO0O0) {
        Preconditions.checkNotNull(oooO0O0, "key");
        int i = 0;
        while (true) {
            Object[][] objArr = this.f119530OooO0o0;
            if (i >= objArr.length) {
                oooO0O0.getClass();
                return null;
            }
            if (oooO0O0.equals(objArr[i][0])) {
                return (T) objArr[i][1];
            }
            i++;
        }
    }

    public final OooO0OO OooO0OO(int i) {
        Preconditions.checkArgument(i >= 0, "invalid maxsize %s", i);
        OooO00o oooO00oOooO0O0 = OooO0O0(this);
        oooO00oOooO0O0.f119541OooO0oo = Integer.valueOf(i);
        return new OooO0OO(oooO00oOooO0O0);
    }

    public final OooO0OO OooO0Oo(int i) {
        Preconditions.checkArgument(i >= 0, "invalid maxsize %s", i);
        OooO00o oooO00oOooO0O0 = OooO0O0(this);
        oooO00oOooO0O0.f119533OooO = Integer.valueOf(i);
        return new OooO0OO(oooO00oOooO0O0);
    }

    public final <T> OooO0OO OooO0o0(OooO0O0<T> oooO0O0, T t) {
        Object[][] objArr;
        Preconditions.checkNotNull(oooO0O0, "key");
        Preconditions.checkNotNull(t, "value");
        OooO00o oooO00oOooO0O0 = OooO0O0(this);
        int i = 0;
        while (true) {
            objArr = this.f119530OooO0o0;
            if (i >= objArr.length) {
                i = -1;
                break;
            }
            if (oooO0O0.equals(objArr[i][0])) {
                break;
            }
            i++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length + (i == -1 ? 1 : 0), 2);
        oooO00oOooO0O0.f119539OooO0o0 = objArr2;
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        if (i == -1) {
            oooO00oOooO0O0.f119539OooO0o0[objArr.length] = new Object[]{oooO0O0, t};
        } else {
            oooO00oOooO0O0.f119539OooO0o0[i] = new Object[]{oooO0O0, t};
        }
        return new OooO0OO(oooO00oOooO0O0);
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperAdd = MoreObjects.toStringHelper(this).add("deadline", this.f119525OooO00o).add("authority", (Object) null).add("callCredentials", this.f119527OooO0OO);
        Executor executor = this.f119526OooO0O0;
        return toStringHelperAdd.add("executor", executor != null ? executor.getClass() : null).add("compressorName", this.f119528OooO0Oo).add("customOptions", Arrays.deepToString(this.f119530OooO0o0)).add("waitForReady", Boolean.TRUE.equals(this.f119531OooO0oO)).add("maxInboundMessageSize", this.f119532OooO0oo).add("maxOutboundMessageSize", this.f119524OooO).add("streamTracerFactories", this.f119529OooO0o).toString();
    }
}
