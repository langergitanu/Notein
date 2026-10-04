package com.huawei.hms.network.embedded;

import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.la */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC18260la {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC18260la f55627a = new a();

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.la$a */
    public class a implements InterfaceC18260la {
        @Override // com.huawei.hms.network.embedded.InterfaceC18260la
        /* JADX INFO: renamed from: a */
        public void mo79067a(int i, EnumC18120ba enumC18120ba) {
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18260la
        /* JADX INFO: renamed from: a */
        public boolean mo79068a(int i, InterfaceC18289nb interfaceC18289nb, int i2, boolean z) throws IOException {
            interfaceC18289nb.skip(i2);
            return true;
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18260la
        /* JADX INFO: renamed from: a */
        public boolean mo79069a(int i, List<C18134ca> list) {
            return true;
        }

        @Override // com.huawei.hms.network.embedded.InterfaceC18260la
        /* JADX INFO: renamed from: a */
        public boolean mo79070a(int i, List<C18134ca> list, boolean z) {
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    void mo79067a(int i, EnumC18120ba enumC18120ba);

    /* JADX INFO: renamed from: a */
    boolean mo79068a(int i, InterfaceC18289nb interfaceC18289nb, int i2, boolean z) throws IOException;

    /* JADX INFO: renamed from: a */
    boolean mo79069a(int i, List<C18134ca> list);

    /* JADX INFO: renamed from: a */
    boolean mo79070a(int i, List<C18134ca> list, boolean z);
}
