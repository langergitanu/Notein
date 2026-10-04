package o0o0OoOo;

import com.aspose.words.StyleIdentifier;
import java.io.File;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import o0o0OoOO.C30717Oooo0OO;
import o0oo000O.C31190OooO0oo;
import o0ooO0O0.C31430OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0o0OoOo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.viewmodel.DebugViewModel$getPdfList$1", m80623f = "DebugViewModel.kt", m80624l = {StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_2, 303}, m80625m = "invokeSuspend")
public final class C30731OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30722OooO00o f109914OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109915OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30731OooOO0O(C30722OooO00o c30722OooO00o, Continuation<? super C30731OooOO0O> continuation) {
        super(2, continuation);
        this.f109914OooOo = c30722OooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30731OooOO0O(this.f109914OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30731OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (oO00ooO.C32460OooOooO.f116667OooO00o == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
    
        if (oO00ooO.C32460OooOooO.f116667OooO00o == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008e, code lost:
    
        return r0;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109915OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C30722OooO00o c30722OooO00o = this.f109914OooOo;
            File file = new File(c30722OooO00o.f109859OooO0Oo.getFilesDir(), "documents");
            boolean zExists = file.exists();
            C33781o00o0O c33781o00o0O = c30722OooO00o.f109881OooOoOO;
            if (zExists) {
                ArrayList<File> arrayListOooOo00 = C31190OooO0oo.OooOo00(file, false);
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayListOooOo00, 10));
                for (File file2 : arrayListOooOo00) {
                    String name = file2.getName();
                    kotlin.jvm.internal.OooOOO0.OooO0o(name, "getName(...)");
                    arrayList.add(new C30717Oooo0OO(name, C31430OooO00o.OooO0OO(file2.length()), file2.lastModified()));
                }
                this.f109915OooOo0o = 2;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, arrayList);
            } else {
                C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
                this.f109915OooOo0o = 1;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, c34434OooOoO);
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
