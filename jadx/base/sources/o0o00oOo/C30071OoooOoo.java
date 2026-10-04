package o0o00oOo;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o00oOo.OoooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$importPresetNotes$1", m80623f = "NoteListViewModel.kt", m80624l = {1375}, m80625m = "invokeSuspend")
public final class C30071OoooOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.notelist.OooO0OO f106977OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f106978OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Context f106979OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30071OoooOoo(com.orion.notein.p607ui.notelist.OooO0OO oooO0OO, Context context, Continuation<? super C30071OoooOoo> continuation) {
        super(2, continuation);
        this.f106977OooOo = oooO0OO;
        this.f106979OooOoO0 = context;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30071OoooOoo(this.f106977OooOo, this.f106979OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30071OoooOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007c A[RETURN] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List listOooO0oO;
        InputStream inputStreamOpen;
        FileOutputStream fileOutputStream;
        byte[] bArr;
        Context context = this.f106979OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f106978OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            com.orion.notein.p607ui.notelist.OooO0OO oooO0OO = this.f106977OooOo;
            try {
                inputStreamOpen = context.getAssets().open("Quick Start Guide.pdf");
                kotlin.jvm.internal.OooOOO0.OooO0o(inputStreamOpen, "open(...)");
                fileOutputStream = new FileOutputStream(new File(context.getFilesDir(), "Quick Start Guide.pdf"));
                bArr = new byte[1024];
            } catch (IOException e) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("NoteListViewModel");
                c20358OooO00o.OooO0Oo(e, "Error closing input stream", new Object[0]);
            }
            while (true) {
                int i2 = inputStreamOpen.read(bArr);
                if (i2 <= 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, i2);
                listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(Uri.fromFile(new File(context.getFilesDir(), "Quick Start Guide.pdf")));
                this.f106978OooOo0o = 1;
                if (com.orion.notein.p607ui.notelist.OooO0OO.OooO0o(oooO0OO, listOooO0oO, null, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            inputStreamOpen.close();
            listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(Uri.fromFile(new File(context.getFilesDir(), "Quick Start Guide.pdf")));
            this.f106978OooOo0o = 1;
            if (com.orion.notein.p607ui.notelist.OooO0OO.OooO0o(oooO0OO, listOooO0oO, null, this) == enumC32485OooO00o) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
