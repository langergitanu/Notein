package com.huawei.hms.drive;

import java.io.IOException;
import java.util.List;
import oOo00OoO.InterfaceC34525OooO0o;

/* JADX INFO: renamed from: com.huawei.hms.drive.dd */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC17848dd {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC17848dd f53354a = new InterfaceC17848dd() { // from class: com.huawei.hms.drive.dd.1
        @Override // com.huawei.hms.drive.InterfaceC17848dd
        /* JADX INFO: renamed from: a */
        public void mo76700a(int i, EnumC17837ct enumC17837ct) {
        }

        @Override // com.huawei.hms.drive.InterfaceC17848dd
        /* JADX INFO: renamed from: a */
        public boolean mo76701a(int i, List<C17838cu> list) {
            return true;
        }

        @Override // com.huawei.hms.drive.InterfaceC17848dd
        /* JADX INFO: renamed from: a */
        public boolean mo76702a(int i, List<C17838cu> list, boolean z) {
            return true;
        }

        @Override // com.huawei.hms.drive.InterfaceC17848dd
        /* JADX INFO: renamed from: a */
        public boolean mo76703a(int i, InterfaceC34525OooO0o interfaceC34525OooO0o, int i2, boolean z) throws IOException {
            interfaceC34525OooO0o.skip(i2);
            return true;
        }
    };

    /* JADX INFO: renamed from: a */
    void mo76700a(int i, EnumC17837ct enumC17837ct);

    /* JADX INFO: renamed from: a */
    boolean mo76701a(int i, List<C17838cu> list);

    /* JADX INFO: renamed from: a */
    boolean mo76702a(int i, List<C17838cu> list, boolean z);

    /* JADX INFO: renamed from: a */
    boolean mo76703a(int i, InterfaceC34525OooO0o interfaceC34525OooO0o, int i2, boolean z) throws IOException;
}
