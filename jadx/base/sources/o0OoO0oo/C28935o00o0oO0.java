package o0OoO0oo;

import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import java.io.File;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OoO0oo.o00o0oO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel", m80623f = "NoteEditorViewModel.kt", m80624l = {818}, m80625m = "saveImageBitmapAsync")
public final class C28935o00o0oO0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f102515OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public File f102516OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f102517OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C23344OooOOo f102518OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28935o00o0oO0(C23344OooOOo c23344OooOOo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f102518OooOoO0 = c23344OooOOo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f102515OooOo = obj;
        this.f102517OooOoO |= Integer.MIN_VALUE;
        return this.f102518OooOoO0.OooOOo0(null, null, null, this);
    }
}
