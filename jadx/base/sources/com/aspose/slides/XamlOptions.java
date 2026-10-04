package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public class XamlOptions extends SaveOptions implements IXamlOptions {

    /* JADX INFO: renamed from: c5 */
    private String f3708c5;

    /* JADX INFO: renamed from: ck */
    private boolean f3709ck;

    /* JADX INFO: renamed from: du */
    private IXamlOutputSaver f3710du;

    /* JADX INFO: renamed from: dy */
    private int f3711dy;

    /* JADX INFO: renamed from: fa */
    private int f3712fa;

    /* JADX INFO: renamed from: h4 */
    private boolean f3713h4;

    /* JADX INFO: renamed from: jd */
    private String f3714jd;

    /* JADX INFO: renamed from: k4 */
    private String f3715k4;

    /* JADX INFO: renamed from: ks */
    private InterfaceC13773le f3717ks;

    /* JADX INFO: renamed from: ne */
    private InterfaceC13773le f3719ne;

    /* JADX INFO: renamed from: rv */
    private InterfaceC13773le f3720rv;

    /* JADX INFO: renamed from: to */
    private boolean f3721to;

    /* JADX INFO: renamed from: up */
    private InterfaceC13773le f3722up;

    /* JADX INFO: renamed from: x6 */
    private InterfaceC13773le f3724x6;

    /* JADX INFO: renamed from: yj */
    private InterfaceC13773le f3725yj;

    /* JADX INFO: renamed from: x1 */
    private String f3723x1 = "";

    /* JADX INFO: renamed from: kk */
    private String f3716kk = "Slide";

    /* JADX INFO: renamed from: m9 */
    private C12015qq f3718m9 = new C12015qq();

    public XamlOptions() {
        m3115x1(1);
        m3101k4(1);
        setOutputSaver(new tla());
        m3103k4(new fzb());
        m3116x1(new izn());
        m3107kk(new fzb());
        m3112to(new izn());
        m3095du(new fzb());
        m3099h4(new izn());
    }

    /* JADX INFO: renamed from: c5 */
    public final int m3092c5() {
        return this.f3712fa;
    }

    /* JADX INFO: renamed from: ck */
    public final InterfaceC13773le m3093ck() {
        return this.f3725yj;
    }

    /* JADX INFO: renamed from: du */
    public final String m3094du() {
        return this.f3708c5;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m3096dy() {
        return this.f3709ck;
    }

    /* JADX INFO: renamed from: fa */
    public final InterfaceC13773le m3097fa() {
        return this.f3717ks;
    }

    @Override // com.aspose.slides.IXamlOptions
    public final boolean getExportHiddenSlides() {
        return this.f3721to;
    }

    @Override // com.aspose.slides.IXamlOptions
    public final IXamlOutputSaver getOutputSaver() {
        return this.f3710du;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m3098h4() {
        return this.f3714jd;
    }

    /* JADX INFO: renamed from: jd */
    public final InterfaceC13773le m3100jd() {
        return this.f3722up;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3101k4(int i) {
        this.f3711dy = i;
    }

    /* JADX INFO: renamed from: kk */
    public final String m3106kk() {
        return !C14113y2.m67411k4(this.f3715k4) ? this.f3715k4 : m3098h4();
    }

    /* JADX INFO: renamed from: ks */
    public final InterfaceC13773le m3108ks() {
        return this.f3719ne;
    }

    /* JADX INFO: renamed from: m9 */
    public final String m3109m9() {
        return this.f3716kk;
    }

    /* JADX INFO: renamed from: rv */
    public final String m3110rv() {
        return this.f3723x1;
    }

    @Override // com.aspose.slides.IXamlOptions
    public final void setExportHiddenSlides(boolean z) {
        this.f3721to = z;
    }

    @Override // com.aspose.slides.IXamlOptions
    public final void setOutputSaver(IXamlOutputSaver iXamlOutputSaver) {
        this.f3710du = iXamlOutputSaver;
    }

    /* JADX INFO: renamed from: to */
    public final int m3111to() {
        return this.f3711dy;
    }

    /* JADX INFO: renamed from: up */
    public final InterfaceC13773le m3113up() {
        return this.f3720rv;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12015qq m3114x1() {
        return this.f3718m9.Clone();
    }

    /* JADX INFO: renamed from: yj */
    public final InterfaceC13773le m3118yj() {
        return this.f3724x6;
    }

    /* JADX INFO: renamed from: du */
    public final void m3095du(InterfaceC13773le interfaceC13773le) {
        this.f3724x6 = interfaceC13773le;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m3099h4(InterfaceC13773le interfaceC13773le) {
        this.f3719ne = interfaceC13773le;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3102k4(C12015qq c12015qq) {
        this.f3718m9 = c12015qq.Clone();
    }

    /* JADX INFO: renamed from: kk */
    public final void m3107kk(InterfaceC13773le interfaceC13773le) {
        this.f3717ks = interfaceC13773le;
    }

    /* JADX INFO: renamed from: to */
    public final void m3112to(InterfaceC13773le interfaceC13773le) {
        this.f3720rv = interfaceC13773le;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m3115x1(int i) {
        this.f3712fa = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3103k4(InterfaceC13773le interfaceC13773le) {
        this.f3722up = interfaceC13773le;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m3116x1(InterfaceC13773le interfaceC13773le) {
        this.f3725yj = interfaceC13773le;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3104k4(String str) {
        this.f3716kk = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m3117x1(String str) {
        this.f3723x1 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m3105k4() {
        return this.f3713h4;
    }
}
