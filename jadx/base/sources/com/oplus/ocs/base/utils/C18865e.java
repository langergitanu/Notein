package com.oplus.ocs.base.utils;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.oplus.ocs.base.utils.e */
/* JADX INFO: loaded from: classes9.dex */
public final class C18865e {

    /* JADX INFO: renamed from: com.oplus.ocs.base.utils.e$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private Object f57610a;

        /* JADX INFO: renamed from: b */
        private List<String> f57611b = new ArrayList();

        public a(Object obj) {
            this.f57610a = C18864d.m80553a(obj);
        }

        /* JADX INFO: renamed from: a */
        public final a m80560a(String str, Object obj) {
            this.f57611b.add(C18864d.m80555a(str + "=" + obj));
            return this;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f57610a.getClass().getSimpleName());
            sb.append('{');
            int size = this.f57611b.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.f57611b.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    public static a m80558a(Object obj) {
        return new a(obj);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m80559a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
