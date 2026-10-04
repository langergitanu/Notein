package com.huawei.hms.drive;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.drive.ba */
/* JADX INFO: loaded from: classes6.dex */
public final class C17791ba {

    /* JADX INFO: renamed from: a */
    private final C17771ah f52782a;

    /* JADX INFO: renamed from: b */
    private final List<C17818ca> f52783b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private int f52784c = 0;

    public C17791ba(C17771ah c17771ah) {
        this.f52782a = c17771ah;
    }

    /* JADX INFO: renamed from: d */
    private C17818ca m76125d() {
        C17818ca c17818ca = null;
        int i = Integer.MAX_VALUE;
        for (C17818ca c17818ca2 : this.f52783b) {
            int size = c17818ca2.f53055d.size();
            if (size < c17818ca2.f53054c && !c17818ca2.f53052a && size < i) {
                c17818ca = c17818ca2;
                i = size;
            }
        }
        return c17818ca;
    }

    /* JADX INFO: renamed from: a */
    public C17771ah m76126a() {
        return this.f52782a;
    }

    /* JADX INFO: renamed from: b */
    public void m76128b(C17818ca c17818ca) {
        this.f52783b.remove(c17818ca);
    }

    /* JADX INFO: renamed from: c */
    public C17818ca m76130c() {
        return m76125d();
    }

    /* JADX INFO: renamed from: a */
    public void m76127a(C17818ca c17818ca) {
        if (this.f52783b.contains(c17818ca)) {
            return;
        }
        this.f52783b.add(c17818ca);
    }

    /* JADX INFO: renamed from: b */
    public boolean m76129b() {
        return this.f52783b.isEmpty();
    }
}
