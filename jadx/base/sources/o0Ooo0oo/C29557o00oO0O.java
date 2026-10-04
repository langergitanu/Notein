package o0Ooo0oo;

import com.orion.notein.domain.models.note.ColorSet;
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0o00Ooo.C29920OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32509OooOOo;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0Ooo0oo.o00oO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$colorSetList$1", m80623f = "PenBarViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29557o00oO0O extends AbstractC32476OooO implements InterfaceC32509OooOOo<List<? extends ColorSet>, Integer, Integer, Continuation<? super List<? extends C29920OooO0oo>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ int f104850OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f104851OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ int f104852OooOoO0;

    @Override // oO0O000o.InterfaceC32509OooOOo
    public final Object invoke(List<? extends ColorSet> list, Integer num, Integer num2, Continuation<? super List<? extends C29920OooO0oo>> continuation) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        C29557o00oO0O c29557o00oO0O = new C29557o00oO0O(4, continuation);
        c29557o00oO0O.f104851OooOo0o = list;
        c29557o00oO0O.f104850OooOo = iIntValue;
        c29557o00oO0O.f104852OooOoO0 = iIntValue2;
        return c29557o00oO0O.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = this.f104851OooOo0o;
        int i = this.f104850OooOo;
        int i2 = this.f104852OooOoO0;
        List<ColorSet> list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        for (ColorSet colorSet : list2) {
            Integer num = null;
            if (colorSet.getType() != 0) {
                if (colorSet.getType() == 2) {
                    String name = colorSet.getName();
                    switch (name.hashCode()) {
                        case 38294328:
                            if (name.equals("青花瓷")) {
                                num = new Integer(R.string.color_set_name_celadon);
                            }
                            break;
                        case 620628890:
                            if (name.equals("中式美学")) {
                                num = new Integer(R.string.color_set_name_chinese_style);
                            }
                            break;
                        case 752999105:
                            if (name.equals("布达佩斯")) {
                                num = new Integer(R.string.color_set_name_budapest);
                            }
                            break;
                        case 773932705:
                            if (name.equals("手帐达人")) {
                                num = new Integer(R.string.color_set_name_handwriter);
                            }
                            break;
                        case 864428855:
                            if (name.equals("港式复古")) {
                                num = new Integer(R.string.color_set_name_hk_style);
                            }
                            break;
                        case 1212905635:
                            if (name.equals("高级撞色")) {
                                num = new Integer(R.string.color_set_name_color_clash);
                            }
                            break;
                    }
                }
            } else {
                String name2 = colorSet.getName();
                switch (name2.hashCode()) {
                    case 670045070:
                        if (name2.equals("可盐可甜")) {
                            num = new Integer(R.string.color_set_name_salt_or_sweet);
                        }
                        break;
                    case 701780828:
                        if (name2.equals("基础颜色")) {
                            num = new Integer(R.string.color_set_name_basic);
                        }
                        break;
                    case 813314226:
                        if (name2.equals("斑马复古")) {
                            num = new Integer(R.string.color_set_name_zebra_vintage);
                        }
                        break;
                    case 1023147040:
                        if (name2.equals("荧光笔色")) {
                            num = new Integer(R.string.color_set_name_highlighter);
                        }
                        break;
                    case 1025375661:
                        if (name2.equals("莫兰迪色")) {
                            num = new Integer(R.string.color_set_name_morandi_color);
                        }
                        break;
                }
            }
            arrayList.add(new C29920OooO0oo(colorSet.getId(), colorSet.getName(), colorSet.getColors(), colorSet.getBackgroundColor(), colorSet.getForegroundColor(), colorSet.getType(), i == 0, num, colorSet.getType() == 2 && i2 != 0));
        }
        return arrayList;
    }
}
