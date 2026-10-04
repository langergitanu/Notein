package com.orion.notein.p607ui.noteeditor.addtext;

import com.orion.notein.p607ui.noteeditor.addtext.OooO0OO;
import com.orion.notein.richeditor.fonts.FontManager;
import com.orion.notein.richeditor.fonts.RTTypeface;
import java.io.File;
import java.util.Iterator;
import java.util.SortedSet;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addtext.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.ImportFontViewModel$importFont$4", m80623f = "ImportFontViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C23380OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super OooO0OO.OooO00o>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f74045OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f74046OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23380OooO0o0(OooO0OO oooO0OO, String str, Continuation<? super C23380OooO0o0> continuation) {
        super(2, continuation);
        this.f74046OooOo0o = oooO0OO;
        this.f74045OooOo = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23380OooO0o0(this.f74046OooOo0o, this.f74045OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super OooO0OO.OooO00o> continuation) {
        return ((C23380OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        OooO0OO oooO0OO = this.f74046OooOo0o;
        File file = new File(oooO0OO.f74015OooO0Oo.getFilesDir(), FontManager.CUSTOM_FONT_DIR);
        String str = this.f74045OooOo;
        String strOooO0o = C32501OooO0oO.OooO0o(new File(str));
        File file2 = new File(str);
        File file3 = new File(file, strOooO0o);
        SortedSet<RTTypeface> fonts = FontManager.getFonts(oooO0OO.f74015OooO0Oo);
        OooOOO0.OooO0Oo(fonts);
        if (!fonts.isEmpty()) {
            Iterator<T> it = fonts.iterator();
            while (it.hasNext()) {
                if (OooOOO0.OooO0O0(((RTTypeface) it.next()).getName(), strOooO0o)) {
                    String name = file2.getName();
                    OooOOO0.OooO0o(name, "getName(...)");
                    return new OooO0OO.OooO00o(2, name);
                }
            }
        }
        if (!OooOOO0.OooO0O0(file2.getParent(), file3.getParent())) {
            C31190OooO0oo.OooO00o(file2, file3);
        }
        String name2 = file2.getName();
        OooOOO0.OooO0o(name2, "getName(...)");
        return new OooO0OO.OooO00o(0, name2);
    }
}
