package o0Ooo000;

import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.dialog.NoteTreeInfo;
import java.util.Collection;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0Ooo000.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.hyperlinkeditor.dialog.NoteTreeSelectionViewModel", m80623f = "NoteTreeSelectionFragment.kt", m80624l = {139, 144, 154}, m80625m = "getChildrenInfo")
public final class C29349OooOo00 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f104076OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C29355OooOoo f104077OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Object f104078OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Collection f104079OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Collection f104080OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ C29355OooOoo f104081OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ Object f104082OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f104083OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29349OooOo00(C29355OooOoo c29355OooOoo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f104081OooOoo = c29355OooOoo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f104082OooOoo0 = obj;
        this.f104083OooOooO |= Integer.MIN_VALUE;
        NoteTreeInfo noteTreeInfo = C29355OooOoo.f104107OooOO0;
        return this.f104081OooOoo.OooO0o0(null, null, this);
    }
}
