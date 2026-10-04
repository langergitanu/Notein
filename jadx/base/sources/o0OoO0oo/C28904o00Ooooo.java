package o0OoO0oo;

import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import java.io.File;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27443o00O00o;
import o0OOo0o.C27449o00O0OoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OoO0oo.o00Ooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel$duplicatedImageFileToPrivateDir$2", m80623f = "NoteEditorViewModel.kt", m80624l = {849}, m80625m = "invokeSuspend")
public final class C28904o00Ooooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C23344OooOOo f102411OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102412OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f102413OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ File f102414OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f102415OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28904o00Ooooo(C23344OooOOo c23344OooOOo, File file, String str, String str2, Continuation<? super C28904o00Ooooo> continuation) {
        super(2, continuation);
        this.f102411OooOo = c23344OooOOo;
        this.f102414OooOoO0 = file;
        this.f102413OooOoO = str;
        this.f102415OooOoOO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28904o00Ooooo(this.f102411OooOo, this.f102414OooOoO0, this.f102413OooOoO, this.f102415OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((C28904o00Ooooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102412OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C27449o00O0OoO c27449o00O0OoO = this.f102411OooOo.f73545OooO0Oo;
        this.f102412OooOo0o = 1;
        c27449o00O0OoO.getClass();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27443o00O00o(c27449o00O0OoO, this.f102414OooOoO0, this.f102413OooOoO, this.f102415OooOoOO, null), this);
        return objOooO0o == enumC32485OooO00o ? enumC32485OooO00o : objOooO0o;
    }
}
