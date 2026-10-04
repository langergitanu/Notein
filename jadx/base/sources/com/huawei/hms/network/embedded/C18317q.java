package com.huawei.hms.network.embedded;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.q */
/* JADX INFO: loaded from: classes9.dex */
public class C18317q extends AbstractC18304p {

    /* JADX INFO: renamed from: a */
    public InterfaceC18408x f55908a = new C18395w();

    /* JADX INFO: renamed from: b */
    public AbstractC18263m f55909b = new C18249l();

    /* JADX INFO: renamed from: c */
    public InterfaceC18382v f55910c;

    /* JADX INFO: renamed from: d */
    public InterfaceC18382v f55911d;

    /* JADX INFO: renamed from: e */
    public InterfaceC18343s f55912e;

    /* JADX INFO: renamed from: f */
    public int f55913f;

    /* JADX INFO: renamed from: g */
    public int f55914g;

    /* JADX INFO: renamed from: h */
    public int f55915h;

    public C18317q() {
        C18369u c18369u = new C18369u();
        this.f55910c = c18369u;
        this.f55911d = c18369u;
        this.f55912e = new C18330r();
        this.f55913f = 0;
        this.f55914g = 0;
        this.f55915h = 0;
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18304p
    /* JADX INFO: renamed from: a */
    public int mo79314a() {
        return this.f55914g;
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18304p
    /* JADX INFO: renamed from: b */
    public AbstractC18263m mo79315b() {
        return this.f55909b;
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18304p
    /* JADX INFO: renamed from: c */
    public InterfaceC18382v mo79316c() {
        return this.f55911d;
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18304p
    /* JADX INFO: renamed from: d */
    public int mo79317d() {
        return this.f55915h;
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18304p
    /* JADX INFO: renamed from: e */
    public InterfaceC18343s mo79318e() {
        return this.f55912e;
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18304p
    /* JADX INFO: renamed from: f */
    public InterfaceC18382v mo79319f() {
        return this.f55910c;
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18304p
    /* JADX INFO: renamed from: g */
    public InterfaceC18408x mo79320g() {
        return this.f55908a;
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18304p
    /* JADX INFO: renamed from: h */
    public int mo79321h() {
        return this.f55913f;
    }

    public String toString() {
        return "NetDiagInfoImpl{systemControlInfo=" + this.f55908a + ", allDetectInfo=" + this.f55909b + ", signalInfo=" + this.f55910c + ", networkInfo=" + this.f55912e + '}';
    }

    /* JADX INFO: renamed from: a */
    public void m79403a(int i) {
        this.f55914g = i;
    }

    /* JADX INFO: renamed from: b */
    public void m79408b(int i) {
        this.f55913f = i;
    }

    /* JADX INFO: renamed from: c */
    public void m79410c(int i) {
        this.f55915h = i;
    }

    /* JADX INFO: renamed from: a */
    public void m79404a(AbstractC18263m abstractC18263m) {
        if (abstractC18263m != null) {
            this.f55909b = abstractC18263m;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m79409b(InterfaceC18382v interfaceC18382v) {
        if (interfaceC18382v != null) {
            this.f55910c = interfaceC18382v;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m79405a(InterfaceC18343s interfaceC18343s) {
        this.f55912e = interfaceC18343s;
    }

    /* JADX INFO: renamed from: a */
    public void m79406a(InterfaceC18382v interfaceC18382v) {
        this.f55911d = interfaceC18382v;
    }

    /* JADX INFO: renamed from: a */
    public void m79407a(InterfaceC18408x interfaceC18408x) {
        if (interfaceC18408x != null) {
            this.f55908a = interfaceC18408x;
        }
    }
}
