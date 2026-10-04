package o0OOo0o;

import android.net.Uri;
import com.aspose.words.EditingLanguage;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOo0o.o000o0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteInFileUseCase", m80623f = "NoteInFileUseCase.kt", m80624l = {EditingLanguage.TATAR}, m80625m = "unzipAndValidateSource")
public final class C27422o000o0OO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f95752OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Uri f95753OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27387o0000o0 f95754OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f95755OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f95756OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27422o000o0OO(C27387o0000o0 c27387o0000o0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f95754OooOoO = c27387o0000o0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f95755OooOoO0 = obj;
        this.f95756OooOoOO |= Integer.MIN_VALUE;
        return C27387o0000o0.Oooo0(this.f95754OooOoO, null, null, this);
    }
}
