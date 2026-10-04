package o0OoOOO0;

import android.content.Context;
import android.graphics.Typeface;
import com.orion.notein.richeditor.fonts.FontManager;
import com.orion.notein.richeditor.fonts.RTTypeface;
import java.io.File;
import java.util.Iterator;
import java.util.SortedSet;
import kotlin.coroutines.Continuation;
import o000oo0.C24684Oooo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoOOO0.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.TextBoxViewModel$downloadFont$2", m80623f = "TextBoxViewModel.kt", m80624l = {563}, m80625m = "invokeSuspend")
public final class C29056OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Typeface>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f102974OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f102975OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f102976OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C29051OooOO0o f102977OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ Context f102978OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29056OooOOO(Context context, String str, Continuation continuation, C29051OooOO0o c29051OooOO0o) {
        super(2, continuation);
        this.f102977OooOoO0 = c29051OooOO0o;
        this.f102976OooOoO = str;
        this.f102978OooOoOO = context;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29056OooOOO(this.f102978OooOoOO, this.f102976OooOoO, continuation, this.f102977OooOoO0);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Typeface> continuation) {
        return ((C29056OooOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object next;
        String str;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102974OooOo;
        Context context = this.f102978OooOoOO;
        String str2 = this.f102976OooOoO;
        C29051OooOO0o c29051OooOO0o = this.f102977OooOoO0;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                c29051OooOO0o.f102911OooOo0.setValue(str2);
                String str3 = str2 + ".ttf";
                String absolutePath = new File(FontManager.getCustomFontDir(context), str3).getAbsolutePath();
                o0OOo0Oo.Oooo000 oooo000 = c29051OooOO0o.f102896OooO0o;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(absolutePath);
                this.f102975OooOo0o = str3;
                this.f102974OooOo = 1;
                Object objOooO0O0 = oooo000.OooO0O0(str3, absolutePath, this);
                if (objOooO0O0 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                str = str3;
                obj = objOooO0O0;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = this.f102975OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
            }
            File file = (File) obj;
            if (!FontManager.addCustomFont(context, file, str2)) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("TextBoxViewModel");
                c20358OooO00o.OooO0OO("download font error: " + str + ", downloadFile: " + file, new Object[0]);
            }
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooO0OO(C24684Oooo.OooO0O0(c20358OooO00o2, "TextBoxViewModel", "download font error: ", e), new Object[0]);
        }
        c29051OooOO0o.f102911OooOo0.setValue(null);
        c29051OooOO0o.OooO0oO(context);
        SortedSet<RTTypeface> fonts = FontManager.getFonts(context);
        kotlin.jvm.internal.OooOOO0.OooO0o(fonts, "getFonts(...)");
        Iterator it = oOo000Oo.OooOo.o0ooOO0(fonts).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((RTTypeface) next).getName(), str2)) {
                break;
            }
        }
        RTTypeface rTTypeface = (RTTypeface) next;
        if (rTTypeface != null) {
            return rTTypeface.getTypeface();
        }
        return null;
    }
}
