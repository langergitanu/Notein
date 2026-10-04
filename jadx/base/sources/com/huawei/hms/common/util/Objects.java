package com.huawei.hms.common.util;

import com.huawei.hms.common.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class Objects {

    public static final class ToStringHelper {

        /* JADX INFO: renamed from: a */
        public final List<String> f52533a;

        /* JADX INFO: renamed from: b */
        public final Object f52534b;

        public ToStringHelper(Object obj) {
            this.f52534b = Preconditions.checkNotNull(obj);
            this.f52533a = new ArrayList();
        }

        public final ToStringHelper add(String str, Object obj) {
            String str2 = (String) Preconditions.checkNotNull(str);
            String strValueOf = String.valueOf(obj);
            this.f52533a.add(str2 + "=" + strValueOf);
            return this;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f52534b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f52533a.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.f52533a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public Objects() {
        throw new AssertionError("illegal argument");
    }

    public static boolean equal(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int hashCode(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj);
    }
}
