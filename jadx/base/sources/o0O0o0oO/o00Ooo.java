package o0O0o0oO;

import Oooo.C20813OooO0o0;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.fragment.app.C21929Ooooo0o;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.google.firebase.firestore.C22609OoooO;
import com.orion.editor.PDFView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.PageColorThemeVO;
import com.orion.notein.p607ui.paperconfig.StandardTemplateFragment;
import com.orion.notein.p607ui.widget.colorpickerpopupwindow.ColorPickerBottomSheetDialog;
import com.orion.penkit.models.LassoParams;
import java.util.List;
import kotlin.jvm.internal.C24034Oooo00O;
import o0OoO0oO.C28679OooO0oo;
import o0o0OOO.C30520o000000o;
import o0o0OOO.C30531o0000Oo0;
import o0o0OOO.C30534o0000o0;
import o0oOo0o0.C30983OooO0o;
import o0oOoOo.C31091ooOO;
import o0oOoo0O.C31147OooO0Oo;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;
import oO0o0Oo.C33781o00o0O;
import oo0oO0.o00O;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o00Ooo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f88987OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f88988OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f88989OooOoO0;

    public /* synthetic */ o00Ooo(int i, Object obj, Object obj2) {
        this.f88988OooOo0o = i;
        this.f88987OooOo = obj;
        this.f88989OooOoO0 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(final View view) {
        switch (this.f88988OooOo0o) {
            case 0:
                C26069o0ooOoO c26069o0ooOoO = ((C26068o0ooOO0) this.f88987OooOo).f89008OooO00o;
                c26069o0ooOoO.getClass();
                InterfaceC31284OooO0O0.OooO00o oooO00o = InterfaceC31284OooO0O0.f111702OooO0O0;
                LassoParams lassoParams = (LassoParams) this.f88989OooOoO0;
                List<InterfaceC31284OooO0O0> selectedItems = lassoParams.getSelectedItems();
                PDFView pDFView = c26069o0ooOoO.f89013OooO00o;
                float zoomLevel = pDFView.getZoomLevel();
                oooO00o.getClass();
                RectF rectFOooO0O0 = InterfaceC31284OooO0O0.OooO00o.OooO0O0(zoomLevel, selectedItems);
                if (rectFOooO0O0 != null) {
                    c26069o0ooOoO.OooO00o(lassoParams.getSelectedItems(), rectFOooO0O0);
                    C22609OoooO c22609OoooO = pDFView.f69269o000o000;
                    if (c22609OoooO != null) {
                        RectF border = lassoParams.getBorder();
                        c22609OoooO.OooO00o(rectFOooO0O0, new PointF((border.left + border.right) / 2.0f, (border.top + border.bottom) / 2.0f));
                    }
                    break;
                }
                break;
            case 1:
                C20813OooO0o0 c20813OooO0o0 = ((C30534o0000o0) this.f88987OooOo).f109153OooO0OO;
                if (c20813OooO0o0 != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    final C31091ooOO c31091ooOO = ((o0oOoOo.o0OoOo0) this.f88989OooOoO0).f110973OooO00o;
                    Object tag = view.getTag();
                    kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.PageColorThemeVO");
                    final PageColorThemeVO pageColorThemeVO = (PageColorThemeVO) tag;
                    final StandardTemplateFragment standardTemplateFragment = (StandardTemplateFragment) c20813OooO0o0.f59765OooO00o;
                    if (!pageColorThemeVO.isAdd()) {
                        if (!pageColorThemeVO.isEditAble()) {
                            if (!standardTemplateFragment.f78690Oooo0oO.contains(Integer.valueOf(pageColorThemeVO.getColor()))) {
                                standardTemplateFragment.OooOoO0(22, new oO0O000o.OooO00o() { // from class: o0o0OOO.o0000oo
                                    @Override // oO0O000o.OooO00o
                                    public final Object invoke() {
                                        standardTemplateFragment.OooOooo().OooOo(pageColorThemeVO.getColor(), c31091ooOO.f110975OooO00o);
                                        return C32460OooOooO.f116667OooO00o;
                                    }
                                });
                            } else {
                                standardTemplateFragment.OooOooo().OooOo(pageColorThemeVO.getColor(), c31091ooOO.f110975OooO00o);
                            }
                        } else {
                            InterfaceC21987OooOoo viewLifecycleOwner = standardTemplateFragment.getViewLifecycleOwner();
                            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30531o0000Oo0(standardTemplateFragment, pageColorThemeVO, null), 3);
                        }
                    } else if (!pageColorThemeVO.isEditAble()) {
                        standardTemplateFragment.OooOoO0(22, new oO0O000o.OooO00o() { // from class: o0o0OOO.o0000O00
                            @Override // oO0O000o.OooO00o
                            public final Object invoke() {
                                C28679OooO0oo c28679OooO0oo = standardTemplateFragment.f78689Oooo0o0;
                                if (c28679OooO0oo == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("pageColorAddPopupWindow");
                                    throw null;
                                }
                                View view2 = view;
                                if (C30983OooO0o.OooO00o(view2, "getContext(...)")) {
                                    FragmentManager childFragmentManager = C21929Ooooo0o.OooO0Oo(view2).getChildFragmentManager();
                                    kotlin.jvm.internal.OooOOO0.OooO0o(childFragmentManager, "getChildFragmentManager(...)");
                                    ColorPickerBottomSheetDialog colorPickerBottomSheetDialog = new ColorPickerBottomSheetDialog();
                                    C28679OooO0oo.OooO00o oooO00o2 = c28679OooO0oo.f111123OooO0oO;
                                    colorPickerBottomSheetDialog.f80136OooOoO0 = oooO00o2;
                                    C31147OooO0Oo c31147OooO0Oo = colorPickerBottomSheetDialog.f80138OooOoo0;
                                    if (c31147OooO0Oo != null) {
                                        c31147OooO0Oo.f111131OooO0OO = oooO00o2;
                                    }
                                    colorPickerBottomSheetDialog.f80135OooOoO = -1;
                                    colorPickerBottomSheetDialog.f80137OooOoOO = new o00O(c28679OooO0oo, 2);
                                    c28679OooO0oo.f111120OooO0Oo = colorPickerBottomSheetDialog;
                                    colorPickerBottomSheetDialog.show(childFragmentManager, "ColorPickerBottomSheetDialog");
                                } else {
                                    c28679OooO0oo.f111120OooO0Oo = null;
                                    if (!c28679OooO0oo.f111124OooO0oo) {
                                        Object systemService = c28679OooO0oo.f111117OooO00o.getSystemService("layout_inflater");
                                        kotlin.jvm.internal.OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                                        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_textbox_text_color, (ViewGroup) null);
                                        kotlin.jvm.internal.OooOOO0.OooO0o(viewInflate, "inflate(...)");
                                        int i = c28679OooO0oo.f111118OooO0O0;
                                        c28679OooO0oo.f111121OooO0o = new PopupWindow(viewInflate, i, c28679OooO0oo.f111119OooO0OO, true);
                                        c28679OooO0oo.f111122OooO0o0 = new C31147OooO0Oo(viewInflate, i, true);
                                        c28679OooO0oo.OooO0O0(viewInflate);
                                        c28679OooO0oo.f111124OooO0oo = true;
                                    }
                                    if (c28679OooO0oo.OooO00o().isShowing()) {
                                        c28679OooO0oo.OooO00o().dismiss();
                                    } else {
                                        C31147OooO0Oo c31147OooO0Oo2 = c28679OooO0oo.f111122OooO0o0;
                                        if (c31147OooO0Oo2 != null) {
                                            c31147OooO0Oo2.OooO00o(-1);
                                            float[] fArr = new float[3];
                                            Color.colorToHSV(c31147OooO0Oo2.f111137OooOO0, fArr);
                                            c31147OooO0Oo2.f111134OooO0o0.setProgress((int) fArr[0]);
                                        }
                                        C31147OooO0Oo c31147OooO0Oo3 = c28679OooO0oo.f111122OooO0o0;
                                        if (c31147OooO0Oo3 != null) {
                                            c31147OooO0Oo3.f111131OooO0OO = c28679OooO0oo.f111123OooO0oO;
                                        }
                                        View contentView = c28679OooO0oo.OooO00o().getContentView();
                                        int width = c28679OooO0oo.OooO00o().getWidth();
                                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(width), width == -2 ? 0 : 1073741824);
                                        int height = c28679OooO0oo.OooO00o().getHeight();
                                        contentView.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(height), height == -2 ? 0 : 1073741824));
                                        Rect rect = new Rect();
                                        view2.getWindowVisibleDisplayFrame(rect);
                                        Rect rect2 = new Rect();
                                        view2.getGlobalVisibleRect(rect2);
                                        c28679OooO0oo.OooO00o().showAsDropDown(view2, Math.min(-((contentView.getMeasuredWidth() - view2.getWidth()) / 2), (rect.right - contentView.getMeasuredWidth()) - rect2.right), 0, 8388659);
                                    }
                                }
                                return C32460OooOooO.f116667OooO00o;
                            }
                        });
                    } else {
                        C30520o000000o c30520o000000oOooOooo = standardTemplateFragment.OooOooo();
                        Boolean bool = Boolean.FALSE;
                        C33781o00o0O c33781o00o0O = c30520o000000oOooOooo.f109018OooOo0o;
                        c33781o00o0O.getClass();
                        c33781o00o0O.OooOO0(null, bool);
                    }
                }
                break;
            default:
                ((View.OnClickListener) this.f88987OooOo).onClick(view);
                DialogFragment dialogFragment = (DialogFragment) ((C24034Oooo00O) this.f88989OooOoO0).f80942OooOo0o;
                if (dialogFragment != null) {
                    dialogFragment.dismiss();
                }
                break;
        }
    }
}
