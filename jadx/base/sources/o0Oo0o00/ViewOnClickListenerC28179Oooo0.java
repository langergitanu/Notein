package o0Oo0o00;

import android.os.Bundle;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.orion.notein.p607ui.datasync.CloudSyncFragment;
import com.orion.notein.p607ui.membership.plan.MembershipPlanDialogFragment;
import com.orion.notein.p607ui.noteeditor.addtext.ImportFontDialogFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.comment.EditorCommentFragment;
import com.orion.notein.p607ui.p609vo.SortKeyVO;
import com.orion.notein.p607ui.settings.debug.SelectNoteDialogFragment;
import com.orion.notein.p607ui.user.coupon.UserCouponsDialogFragment;
import com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment.OooO0o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import o0OOo0Oo.EnumC27285OooO;
import o0o0O0o.C30294OooO0OO;
import o0o0OOO0.C30544OooO0O0;
import o0o0OoOO.C30718Oooo0o;
import o0oOoOo.C31034OooO0o;
import o0oOoOo.C31039OooOO0O;
import oO00ooO.C32443OooOOO;
import oO0o0OO.C33609OooO0oo;
import oO0o0Oo.C33781o00o0O;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: renamed from: o0Oo0o00.Oooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28179Oooo0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f99865OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f99866OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28179Oooo0(Fragment fragment, int i) {
        this.f99866OooOo0o = i;
        this.f99865OooOo = fragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        String str;
        switch (this.f99866OooOo0o) {
            case 0:
                CloudSyncFragment cloudSyncFragment = (CloudSyncFragment) this.f99865OooOo;
                cloudSyncFragment.OooOooO("oneDriveSwitch");
                SwitchMaterial switchMaterial = cloudSyncFragment.f71438OooOoo;
                if (switchMaterial != null) {
                    cloudSyncFragment.OooOooo(switchMaterial, EnumC27285OooO.f95078OooOoO0);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("oneDriveSwitch");
                    throw null;
                }
            case 1:
                ImportFontDialogFragment importFontDialogFragment = (ImportFontDialogFragment) this.f99865OooOo;
                int iIntValue = ((Number) importFontDialogFragment.OooOoo().f74022OooOO0o.f121747OooOo0o.getValue()).intValue();
                if (iIntValue == 0) {
                    importFontDialogFragment.dismissAllowingStateLoss();
                    return;
                }
                if (iIntValue != 1) {
                    if (iIntValue != 2) {
                        return;
                    }
                    com.orion.notein.p607ui.noteeditor.addtext.OooO0OO oooO0OOOooOoo = importFontDialogFragment.OooOoo();
                    C34438OooOoo0 c34438OooOoo0 = C34438OooOoo0.f123458OooOo0o;
                    C33781o00o0O c33781o00o0O = oooO0OOOooOoo.f74014OooO;
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, c34438OooOoo0);
                    return;
                }
                com.orion.notein.p607ui.noteeditor.addtext.OooO0OO oooO0OOOooOoo2 = importFontDialogFragment.OooOoo();
                Iterable iterable = (Iterable) oooO0OOOooOoo2.f74021OooOO0O.f121747OooOo0o.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (!((C31039OooOO0O) obj).f110818OooO0OO) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((C31039OooOO0O) it.next()).f110816OooO00o);
                }
                Set setO0OO00O = oOo000Oo.OooOo.o0OO00O(arrayList2);
                C33781o00o0O c33781o00o0O2 = oooO0OOOooOoo2.f74014OooO;
                c33781o00o0O2.getClass();
                c33781o00o0O2.OooOO0(null, setO0OO00O);
                return;
            case 2:
                kotlin.jvm.internal.OooOOO0.OooO0oO(v, "v");
                Object tag = v.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.SortKeyVO");
                SortKeyVO sortKeyVO = (SortKeyVO) tag;
                EditorCommentFragment editorCommentFragment = (EditorCommentFragment) this.f99865OooOo;
                C30294OooO0OO c30294OooO0OO = editorCommentFragment.f75728Oooo0o0;
                if (c30294OooO0OO != null) {
                    c30294OooO0OO.OooO00o();
                }
                if (!sortKeyVO.isVipBadgeVisible()) {
                    editorCommentFragment.OooOoo().OooO0o0(sortKeyVO.getKey());
                    return;
                }
                InterfaceC21987OooOoo viewLifecycleOwner = editorCommentFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, editorCommentFragment.new OooO0o(null), 3);
                return;
            case 3:
                SelectNoteDialogFragment selectNoteDialogFragment = (SelectNoteDialogFragment) this.f99865OooOo;
                C30544OooO0O0 c30544OooO0O0 = (C30544OooO0O0) selectNoteDialogFragment.OooOoo0().f109993OooO.f121747OooOo0o.getValue();
                if (c30544OooO0O0 == null || (str = c30544OooO0O0.f109255OooO00o) == null) {
                    return;
                }
                selectNoteDialogFragment.getParentFragmentManager().OooooOo(BundleKt.bundleOf(new C32443OooOOO("note_id", str)), ((C30718Oooo0o) selectNoteDialogFragment.f79106OooOooo.getValue()).f109849OooO00o);
                selectNoteDialogFragment.dismissAllowingStateLoss();
                return;
            default:
                Object tag2 = v.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag2, "null cannot be cast to non-null type com.orion.notein.ui.vo.CouponVO");
                C31034OooO0o c31034OooO0o = (C31034OooO0o) tag2;
                UserCouponsDialogFragment userCouponsDialogFragment = (UserCouponsDialogFragment) this.f99865OooOo;
                MembershipPlanDialogFragment membershipPlanDialogFragment = new MembershipPlanDialogFragment();
                Bundle bundle = new Bundle();
                bundle.putString("product_code", c31034OooO0o.f110801OooO0OO);
                bundle.putString("coupon_id", c31034OooO0o.f110799OooO00o);
                membershipPlanDialogFragment.setArguments(bundle);
                membershipPlanDialogFragment.show(userCouponsDialogFragment.getParentFragmentManager(), "MembershipDialogFragment");
                userCouponsDialogFragment.dismissAllowingStateLoss();
                return;
        }
    }
}
