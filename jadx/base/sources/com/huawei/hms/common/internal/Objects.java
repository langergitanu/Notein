package com.huawei.hms.common.internal;

import com.aspose.slides.OooOOO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class Objects {

    public static final class ToStringHelper {

        /* JADX INFO: renamed from: a */
        public final List<String> f52503a;

        /* JADX INFO: renamed from: b */
        public final Object f52504b;

        public final ToStringHelper add(String str, Object obj) {
            String str2 = (String) Preconditions.checkNotNull(str);
            String strValueOf = String.valueOf(obj);
            this.f52503a.add(OooOOO.OooO0O0(new StringBuilder(strValueOf.length() + str2.length() + 1), str2, "=", strValueOf));
            return this;
        }

        public final String toString() {
            String simpleName = this.f52504b.getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(100);
            sb.append(simpleName);
            sb.append('{');
            int size = this.f52503a.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.f52503a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }

        public ToStringHelper(Object obj) {
            this.f52504b = Preconditions.checkNotNull(obj);
            this.f52503a = new ArrayList();
        }
    }

    public Objects() {
        throw new AssertionError("Uninstantiable");
    }

    public static boolean equal(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        return obj != null && obj.equals(obj2);
    }

    public static int hashCode(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj);
    }
}
