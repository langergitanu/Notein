package androidx.appcompat.view.menu;

import OooO0oo.C20441OooO00o;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC21512OooOOOo;
import androidx.appcompat.widget.C21565OoooOO0;
import com.orion.notein.global.R;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC21512OooOOOo.OooO00o, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ImageView f62542OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooOO0O f62543OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public TextView f62544OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public RadioButton f62545OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public CheckBox f62546OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public ImageView f62547OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public TextView f62548OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public ImageView f62549OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public LinearLayout f62550OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f62551Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final Drawable f62552Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final int f62553Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final Context f62554Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final Drawable f62555Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final boolean f62556Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f62557Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public LayoutInflater f62558Oooo0o0;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C21565OoooOO0 c21565OoooOO0OooO0o = C21565OoooOO0.OooO0o(getContext(), attributeSet, C20441OooO00o.f58296OooOOoo, R.attr.listMenuViewStyle, 0);
        this.f62552Oooo000 = c21565OoooOO0OooO0o.OooO0O0(5);
        TypedArray typedArray = c21565OoooOO0OooO0o.f63093OooO0O0;
        this.f62553Oooo00O = typedArray.getResourceId(1, -1);
        this.f62551Oooo0 = typedArray.getBoolean(7, false);
        this.f62554Oooo00o = context;
        this.f62555Oooo0O0 = c21565OoooOO0OooO0o.OooO0O0(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f62556Oooo0OO = typedArrayObtainStyledAttributes.hasValue(0);
        c21565OoooOO0OooO0o.OooO0oO();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f62558Oooo0o0 == null) {
            this.f62558Oooo0o0 = LayoutInflater.from(getContext());
        }
        return this.f62558Oooo0o0;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f62547OooOoo;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f62549OooOooO;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f62549OooOooO.getLayoutParams();
        rect.top = this.f62549OooOooO.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC21512OooOOOo.OooO00o
    public OooOO0O getItemData() {
        return this.f62543OooOo0o;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    @Override // androidx.appcompat.view.menu.InterfaceC21512OooOOOo.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void initialize(OooOO0O oooOO0O, int i) {
        boolean z;
        int i2;
        String string;
        boolean z2;
        this.f62543OooOo0o = oooOO0O;
        setVisibility(oooOO0O.isVisible() ? 0 : 8);
        setTitle(oooOO0O.f62645OooO0o0);
        setCheckable(oooOO0O.isCheckable());
        if (oooOO0O.f62651OooOOO.isShortcutsVisible()) {
            if ((oooOO0O.f62651OooOOO.isQwertyMode() ? oooOO0O.f62648OooOO0 : oooOO0O.f62647OooO0oo) != 0) {
                z = true;
            }
        } else {
            z = false;
        }
        oooOO0O.f62651OooOOO.isQwertyMode();
        if (z) {
            OooOO0O oooOO0O2 = this.f62543OooOo0o;
            if (oooOO0O2.f62651OooOOO.isShortcutsVisible()) {
                if ((oooOO0O2.f62651OooOOO.isQwertyMode() ? oooOO0O2.f62648OooOO0 : oooOO0O2.f62647OooO0oo) != 0) {
                    z2 = true;
                }
                if (z2) {
                }
            } else {
                z2 = false;
                i2 = z2 ? 0 : 8;
            }
        }
        if (i2 == 0) {
            TextView textView = this.f62548OooOoo0;
            OooOO0O oooOO0O3 = this.f62543OooOo0o;
            char c = oooOO0O3.f62651OooOOO.isQwertyMode() ? oooOO0O3.f62648OooOO0 : oooOO0O3.f62647OooO0oo;
            if (c == 0) {
                string = "";
            } else {
                OooO oooO = oooOO0O3.f62651OooOOO;
                Resources resources = oooO.getContext().getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(oooO.getContext()).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i3 = oooO.isQwertyMode() ? oooOO0O3.f62649OooOO0O : oooOO0O3.f62639OooO;
                OooOO0O.OooO00o(sb, i3, resources.getString(R.string.abc_menu_meta_shortcut_label), 65536);
                OooOO0O.OooO00o(sb, i3, resources.getString(R.string.abc_menu_ctrl_shortcut_label), 4096);
                OooOO0O.OooO00o(sb, i3, resources.getString(R.string.abc_menu_alt_shortcut_label), 2);
                OooOO0O.OooO00o(sb, i3, resources.getString(R.string.abc_menu_shift_shortcut_label), 1);
                OooOO0O.OooO00o(sb, i3, resources.getString(R.string.abc_menu_sym_shortcut_label), 4);
                OooOO0O.OooO00o(sb, i3, resources.getString(R.string.abc_menu_function_shortcut_label), 8);
                if (c == '\b') {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c == '\n') {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c != ' ') {
                    sb.append(c);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f62548OooOoo0.getVisibility() != i2) {
            this.f62548OooOoo0.setVisibility(i2);
        }
        setIcon(oooOO0O.getIcon());
        setEnabled(oooOO0O.isEnabled());
        setSubMenuArrowVisible(oooOO0O.hasSubMenu());
        setContentDescription(oooOO0O.f62656OooOOo0);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f62552Oooo000);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f62544OooOoO = textView;
        int i = this.f62553Oooo00O;
        if (i != -1) {
            textView.setTextAppearance(this.f62554Oooo00o, i);
        }
        this.f62548OooOoo0 = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f62547OooOoo = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f62555Oooo0O0);
        }
        this.f62549OooOooO = (ImageView) findViewById(R.id.group_divider);
        this.f62550OooOooo = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f62542OooOo != null && this.f62551Oooo0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f62542OooOo.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.f62545OooOoO0 == null && this.f62546OooOoOO == null) {
            return;
        }
        if ((this.f62543OooOo0o.f62658OooOo & 4) != 0) {
            if (this.f62545OooOoO0 == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f62545OooOoO0 = radioButton;
                LinearLayout linearLayout = this.f62550OooOooo;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f62545OooOoO0;
            view = this.f62546OooOoOO;
        } else {
            if (this.f62546OooOoOO == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f62546OooOoOO = checkBox;
                LinearLayout linearLayout2 = this.f62550OooOooo;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f62546OooOoOO;
            view = this.f62545OooOoO0;
        }
        if (z) {
            compoundButton.setChecked(this.f62543OooOo0o.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f62546OooOoOO;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f62545OooOoO0;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.f62543OooOo0o.f62658OooOo & 4) != 0) {
            if (this.f62545OooOoO0 == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f62545OooOoO0 = radioButton;
                LinearLayout linearLayout = this.f62550OooOooo;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f62545OooOoO0;
        } else {
            if (this.f62546OooOoOO == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f62546OooOoOO = checkBox;
                LinearLayout linearLayout2 = this.f62550OooOooo;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f62546OooOoOO;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f62557Oooo0o = z;
        this.f62551Oooo0 = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f62549OooOooO;
        if (imageView != null) {
            imageView.setVisibility((this.f62556Oooo0OO || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f62543OooOo0o.f62651OooOOO.getOptionalIconsVisible() || this.f62557Oooo0o;
        if (z || this.f62551Oooo0) {
            ImageView imageView = this.f62542OooOo;
            if (imageView == null && drawable == null && !this.f62551Oooo0) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f62542OooOo = imageView2;
                LinearLayout linearLayout = this.f62550OooOooo;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f62551Oooo0) {
                this.f62542OooOo.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f62542OooOo;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f62542OooOo.getVisibility() != 0) {
                this.f62542OooOo.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f62544OooOoO.getVisibility() != 8) {
                this.f62544OooOoO.setVisibility(8);
            }
        } else {
            this.f62544OooOoO.setText(charSequence);
            if (this.f62544OooOoO.getVisibility() != 0) {
                this.f62544OooOoO.setVisibility(0);
            }
        }
    }
}
