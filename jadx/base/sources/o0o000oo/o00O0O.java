package o0o000oo;

import Oooo0.C20860Ooooooo;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o0o00Oo0.C29908OooO00o;
import o0o00Oo0.C29909OooO0O0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32513OooOo0O;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ToolbarViewModel$toolbarItems$1", m80623f = "ToolbarViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class o00O0O extends AbstractC32476OooO implements InterfaceC32513OooOo0O<NoteMeta, Boolean, Boolean, Boolean, List<? extends C29909OooO0O0>, Set<? extends Integer>, Boolean, Continuation<? super List<? extends C29908OooO00o>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Boolean f105911OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ NoteMeta f105912OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ boolean f105913OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ boolean f105914OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ List f105915OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public /* synthetic */ boolean f105916OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ Set f105917OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f105918OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(o00Ooo o00ooo2, Continuation<? super o00O0O> continuation) {
        super(8, continuation);
        this.f105918OooOooO = o00ooo2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0337  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        Map mapOooOO0o;
        int i;
        Integer numValueOf;
        Object c29908OooO00o;
        int i2;
        C32443OooOOO c32443OooOOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        NoteMeta noteMeta = this.f105912OooOo0o;
        Boolean bool = this.f105911OooOo;
        boolean z = this.f105914OooOoO0;
        boolean z2 = this.f105913OooOoO;
        List list = this.f105915OooOoOO;
        Set set = this.f105917OooOoo0;
        boolean z3 = this.f105916OooOoo;
        if (noteMeta == null || bool == null) {
            return C34434OooOoO.f123453OooOo0o;
        }
        o00Ooo o00ooo2 = this.f105918OooOooO;
        o00ooo2.getClass();
        Map mapOooOO0o2 = C34436OooOoOO.f123455OooOo0o;
        if (list != null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            int i3 = 0;
            for (Object obj2 : list2) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    C34429OooOOo0.OooOOo();
                    throw null;
                }
                C29909OooO0O0 c29909OooO0O0 = (C29909OooO0O0) obj2;
                arrayList.add(new C32443OooOOO(Integer.valueOf(c29909OooO0O0.f106118OooO00o), c29909OooO0O0));
                i3 = i4;
            }
            th = null;
            mapOooOO0o = C34444Oooo0O0.OooOO0o(arrayList);
        } else {
            th = null;
            mapOooOO0o = mapOooOO0o2;
        }
        if (list != null) {
            List list3 = list;
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list3, 10));
            int i5 = 0;
            for (Object obj3 : list3) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    C34429OooOOo0.OooOOo();
                    throw th;
                }
                arrayList2.add(new C32443OooOOO(Integer.valueOf(((C29909OooO0O0) obj3).f106118OooO00o), Integer.valueOf(i5)));
                i5 = i6;
            }
            mapOooOO0o2 = C34444Oooo0O0.OooOO0o(arrayList2);
        }
        List<C29909OooO0O0> list4 = o00ooo2.f105929OooOO0;
        ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list4, 10));
        int i7 = 0;
        for (Object obj4 : list4) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                C34429OooOOo0.OooOOo();
                throw th;
            }
            C29909OooO0O0 c29909OooO0O02 = (C29909OooO0O0) obj4;
            boolean zContainsKey = mapOooOO0o2.containsKey(Integer.valueOf(c29909OooO0O02.f106118OooO00o));
            int i9 = c29909OooO0O02.f106118OooO00o;
            if (zContainsKey) {
                Integer numValueOf2 = Integer.valueOf(i9);
                Object obj5 = mapOooOO0o2.get(Integer.valueOf(i9));
                kotlin.jvm.internal.OooOOO0.OooO0Oo(obj5);
                c32443OooOOO = new C32443OooOOO(numValueOf2, obj5);
            } else {
                c32443OooOOO = new C32443OooOOO(Integer.valueOf(i9), Integer.valueOf(i7));
            }
            arrayList3.add(c32443OooOOO);
            i7 = i8;
        }
        List<C29908OooO00o> listO00O0O = oOo000Oo.OooOo.o00O0O(o00ooo2.f105928OooO0oo, new C29855OooooOO(C34444Oooo0O0.OooOO0o(arrayList3)));
        ArrayList arrayList4 = new ArrayList();
        for (C29908OooO00o c29908OooO00o2 : listO00O0O) {
            C29909OooO0O0 c29909OooO0O03 = (C29909OooO0O0) mapOooOO0o.get(Integer.valueOf(c29908OooO00o2.f106114OooO00o));
            Object obj6 = c29908OooO00o2;
            if (c29909OooO0O03 != null) {
                obj6 = c29908OooO00o2;
                if (!c29909OooO0O03.f106121OooO0Oo) {
                    obj6 = th;
                }
            }
            if (obj6 != null) {
                arrayList4.add(obj6);
            }
        }
        ArrayList<C29908OooO00o> arrayList5 = new ArrayList();
        for (Object obj7 : arrayList4) {
            C29908OooO00o c29908OooO00o3 = (C29908OooO00o) obj7;
            if (z3 || c29908OooO00o3.f106114OooO00o != 10) {
                arrayList5.add(obj7);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for (C29908OooO00o c29908OooO00o4 : arrayList5) {
            if (!(noteMeta.getUnboundedNote() && ((i2 = c29908OooO00o4.f106114OooO00o) == 7 || i2 == 16 || i2 == 18)) && ((noteMeta.getLockAdded() || c29908OooO00o4.f106114OooO00o != 12) && ((i = c29908OooO00o4.f106114OooO00o) != 9 || z2))) {
                boolean zContains = set.contains(new Integer(i));
                boolean zBooleanValue = bool.booleanValue();
                int i10 = c29908OooO00o4.f106114OooO00o;
                if (zBooleanValue) {
                    switch (i10) {
                        case 2:
                            numValueOf = Integer.valueOf(R.drawable.ic_ni_tools_pen_bar_immersive_selector);
                            break;
                        case 3:
                            numValueOf = Integer.valueOf(R.drawable.ic_ni_tools_textbox_immersive_selector);
                            break;
                        case 4:
                            numValueOf = Integer.valueOf(R.drawable.ic_ni_tools_insert_file_immersive_selector);
                            break;
                        case 5:
                            numValueOf = Integer.valueOf(R.drawable.ic_ni_tools_screenshot_immersive_selector);
                            break;
                        case 6:
                            numValueOf = Integer.valueOf(R.drawable.ic_ni_tools_text_anno_immersive_selector);
                            break;
                        case 7:
                            numValueOf = Integer.valueOf(R.drawable.ic_ni_tools_add_hyperlink_immersive_selector);
                            break;
                        case 8:
                            numValueOf = Integer.valueOf(zContains ? R.drawable.ic_ni_tools_stop_recording_immersive_selector : R.drawable.ic_ni_tools_recording_immersive_selector);
                            break;
                        case 9:
                            numValueOf = Integer.valueOf(z ? R.drawable.ic_ni_tools_pause_audio_immersive_selector : R.drawable.ic_ni_tools_play_audio_immersive_selector);
                            break;
                        case 10:
                            numValueOf = Integer.valueOf(R.drawable.ic_ni_tools_tap_reading_immersive_selector);
                            break;
                        case 11:
                            numValueOf = Integer.valueOf(R.drawable.ic_ni_tools_page_layer_immersive_selector);
                            break;
                        case 12:
                            numValueOf = Integer.valueOf(R.drawable.ic_ni_tools_lock_immersive_selector);
                            break;
                        case 13:
                            numValueOf = Integer.valueOf(R.drawable.ic_ni_tools_ai_feature_immersive_selector);
                            break;
                        case 14:
                            numValueOf = Integer.valueOf(R.drawable.ic_ni_tools_setting_immersive_selector);
                            break;
                        case 15:
                            numValueOf = Integer.valueOf(R.drawable.ic_ni_tools_fullscreen_immersive_selector);
                            break;
                        case 16:
                            numValueOf = Integer.valueOf(R.drawable.ic_ni_tools_add_page_immersive_selector);
                            break;
                        case 17:
                            numValueOf = Integer.valueOf(R.drawable.ic_ni_tools_config_page_immersive_selector);
                            break;
                        case 18:
                            numValueOf = Integer.valueOf(R.drawable.ic_ni_tools_page_padding_immersive_selector);
                            break;
                        case 19:
                            numValueOf = Integer.valueOf(R.drawable.ic_ni_tools_ruler_immersive_selector);
                            break;
                        default:
                            numValueOf = th;
                            break;
                    }
                    if (numValueOf != 0) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooO0OO(C20860Ooooooo.OooO0OO(c20358OooO00o, "ToolbarViewModel", "iconRes is null for type: ", i10), new Object[0]);
                        c29908OooO00o = th;
                    } else {
                        c29908OooO00o = new C29908OooO00o(i10, numValueOf.intValue(), c29908OooO00o4.f106116OooO0OO, zContains);
                    }
                } else {
                    switch (i10) {
                        case 2:
                            numValueOf = Integer.valueOf(R.drawable.ic_ni_tools_pen_bar_selector);
                            break;
                        case 3:
                            numValueOf = Integer.valueOf(R.drawable.ic_ni_textbox_selector);
                            break;
                        case 4:
                            numValueOf = Integer.valueOf(R.drawable.ic_ni_tools_insert_file_selector);
                            break;
                        case 5:
                            numValueOf = Integer.valueOf(R.drawable.ic_ni_screenshot_selector);
                            break;
                        case 6:
                            numValueOf = Integer.valueOf(R.drawable.ic_ni_tools_text_anno_selector);
                            break;
                        case 7:
                            numValueOf = Integer.valueOf(R.drawable.ic_ni_tools_add_hyperlink_selector);
                            break;
                        case 8:
                            numValueOf = Integer.valueOf(zContains ? R.drawable.ic_ni_tools_stop_recording_selector : R.drawable.ic_ni_tools_audio_recorder_selector);
                            break;
                        case 9:
                            numValueOf = Integer.valueOf(z ? R.drawable.ic_ni_tools_pause_audio_selector : R.drawable.ic_ni_tools_audio_playback_selector);
                            break;
                        case 10:
                            numValueOf = Integer.valueOf(R.drawable.ic_ni_tools_tap_reading_selector);
                            break;
                        case 11:
                            numValueOf = Integer.valueOf(R.drawable.ic_ni_tools_page_layer_selector);
                            break;
                        case 12:
                            numValueOf = Integer.valueOf(R.drawable.ic_ni_unlock_note_selector);
                            break;
                        case 13:
                            numValueOf = Integer.valueOf(R.drawable.ic_ni_tools_ai_feature_selector);
                            break;
                        case 14:
                            numValueOf = Integer.valueOf(R.drawable.ic_ni_setting_selector);
                            break;
                        case 15:
                            numValueOf = Integer.valueOf(R.drawable.ic_ni_fullscreen_mode_selector);
                            break;
                        case 16:
                            numValueOf = Integer.valueOf(R.drawable.ic_ni_add_new_page_selector);
                            break;
                        case 17:
                            numValueOf = Integer.valueOf(R.drawable.ic_ni_config_page_selector);
                            break;
                        case 18:
                            numValueOf = Integer.valueOf(R.drawable.ic_ni_tools_page_padding_selector);
                            break;
                        case 19:
                            numValueOf = Integer.valueOf(R.drawable.ic_ni_tools_ruler_selector);
                            break;
                    }
                    if (numValueOf != 0) {
                    }
                }
            } else {
                c29908OooO00o = th;
            }
            if (c29908OooO00o != null) {
                arrayList6.add(c29908OooO00o);
            }
        }
        return arrayList6;
    }

    @Override // oO0O000o.InterfaceC32513OooOo0O
    public final Object o0Oo0oo(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Serializable serializable) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj7).booleanValue();
        o00O0O o00o0o2 = new o00O0O(this.f105918OooOooO, (Continuation) serializable);
        o00o0o2.f105912OooOo0o = (NoteMeta) obj;
        o00o0o2.f105911OooOo = (Boolean) obj2;
        o00o0o2.f105914OooOoO0 = zBooleanValue;
        o00o0o2.f105913OooOoO = zBooleanValue2;
        o00o0o2.f105915OooOoOO = (List) obj5;
        o00o0o2.f105917OooOoo0 = (Set) obj6;
        o00o0o2.f105916OooOoo = zBooleanValue3;
        return o00o0o2.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }
}
