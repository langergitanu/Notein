package o0OOo0o;

import android.graphics.PointF;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOo0o.o00oOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.TextRecognitionAndSearchUseCase", m80623f = "TextRecognitionAndSearchUseCase.kt", m80624l = {1322}, m80625m = "recognizeHandWriting")
public final class C27561o00oOo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public float f96692OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public PointF f96693OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27545o00o0oo0 f96694OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f96695OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f96696OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27561o00oOo(C27545o00o0oo0 c27545o00o0oo0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f96694OooOoO = c27545o00o0oo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f96695OooOoO0 = obj;
        this.f96696OooOoOO |= Integer.MIN_VALUE;
        int i = C27545o00o0oo0.f96574OooOO0o;
        return this.f96694OooOoO.OooOO0o(null, null, 0.0f, false, this);
    }
}
