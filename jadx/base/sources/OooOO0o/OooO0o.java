package OooOO0o;

import OooO0o.C20424OooO0Oo;
import OooO0oo.C20441OooO00o;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.MenuItemC21510OooOO0o;
import androidx.appcompat.view.menu.OooO;
import androidx.appcompat.view.menu.OooOO0O;
import androidx.appcompat.widget.C21545OooOooO;
import androidx.appcompat.widget.C21565OoooOO0;
import androidx.core.internal.view.SupportMenu;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;
import androidx.core.view.MenuItemCompat;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o extends MenuInflater {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Class<?>[] f58334OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Class<?>[] f58335OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object[] f58336OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object[] f58337OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Context f58338OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Object f58339OooO0Oo;

    public static class OooO00o implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final Class<?>[] f58340OooO0OO = {MenuItem.class};

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Object f58341OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Method f58342OooO0O0;

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Method method = this.f58342OooO0O0;
            try {
                Class<?> returnType = method.getReturnType();
                Class<?> cls = Boolean.TYPE;
                Object obj = this.f58341OooO00o;
                if (returnType == cls) {
                    return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                }
                method.invoke(obj, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public class OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f58343OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Menu f58344OooO00o;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f58351OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f58352OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public CharSequence f58353OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public CharSequence f58354OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public char f58355OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public int f58356OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public int f58357OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public char f58358OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public int f58359OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public int f58360OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public boolean f58361OooOOoo;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public String f58362OooOo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public boolean f58363OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public boolean f58364OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public int f58365OooOo0O;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f58366OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public ActionProvider f58367OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public String f58368OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public CharSequence f58369OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public CharSequence f58371OooOoo0;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public ColorStateList f58370OooOoo = null;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public PorterDuff.Mode f58372OooOooO = null;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f58345OooO0O0 = 0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f58346OooO0OO = 0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f58347OooO0Oo = 0;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f58349OooO0o0 = 0;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f58348OooO0o = true;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f58350OooO0oO = true;

        public OooO0O0(Menu menu) {
            this.f58344OooO00o = menu;
        }

        public final <T> T OooO00o(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, OooO0o.this.f58338OooO0OO.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        public final void OooO0O0(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f58361OooOOoo).setVisible(this.f58364OooOo00).setEnabled(this.f58363OooOo0).setCheckable(this.f58359OooOOo >= 1).setTitleCondensed(this.f58354OooOO0o).setIcon(this.f58356OooOOO0);
            int i = this.f58365OooOo0O;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            String str = this.f58368OooOoO0;
            OooO0o oooO0o = OooO0o.this;
            if (str != null) {
                if (oooO0o.f58338OooO0OO.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                if (oooO0o.f58339OooO0Oo == null) {
                    oooO0o.f58339OooO0Oo = OooO0o.OooO00o(oooO0o.f58338OooO0OO);
                }
                Object obj = oooO0o.f58339OooO0Oo;
                String str2 = this.f58368OooOoO0;
                OooO00o oooO00o = new OooO00o();
                oooO00o.f58341OooO00o = obj;
                Class<?> cls = obj.getClass();
                try {
                    oooO00o.f58342OooO0O0 = cls.getMethod(str2, OooO00o.f58340OooO0OO);
                    menuItem.setOnMenuItemClickListener(oooO00o);
                } catch (Exception e) {
                    StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Couldn't resolve menu item onClick handler ", str2, " in class ");
                    sbOooO0o0.append(cls.getName());
                    InflateException inflateException = new InflateException(sbOooO0o0.toString());
                    inflateException.initCause(e);
                    throw inflateException;
                }
            }
            if (this.f58359OooOOo >= 2) {
                if (menuItem instanceof OooOO0O) {
                    ((OooOO0O) menuItem).OooO0Oo(true);
                } else if (menuItem instanceof MenuItemC21510OooOO0o) {
                    MenuItemC21510OooOO0o menuItemC21510OooOO0o = (MenuItemC21510OooOO0o) menuItem;
                    try {
                        Method method = menuItemC21510OooOO0o.f62671OooO0o0;
                        SupportMenuItem supportMenuItem = menuItemC21510OooOO0o.f62670OooO0Oo;
                        if (method == null) {
                            menuItemC21510OooOO0o.f62671OooO0o0 = supportMenuItem.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        menuItemC21510OooOO0o.f62671OooO0o0.invoke(supportMenuItem, Boolean.TRUE);
                    } catch (Exception e2) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                    }
                }
            }
            String str3 = this.f58362OooOo;
            if (str3 != null) {
                menuItem.setActionView((View) OooO00o(str3, OooO0o.f58335OooO0o0, oooO0o.f58336OooO00o));
                z = true;
            }
            int i2 = this.f58366OooOo0o;
            if (i2 > 0) {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i2);
                }
            }
            ActionProvider actionProvider = this.f58367OooOoO;
            if (actionProvider != null) {
                MenuItemCompat.setActionProvider(menuItem, actionProvider);
            }
            MenuItemCompat.setContentDescription(menuItem, this.f58369OooOoOO);
            MenuItemCompat.setTooltipText(menuItem, this.f58371OooOoo0);
            MenuItemCompat.setAlphabeticShortcut(menuItem, this.f58355OooOOO, this.f58357OooOOOO);
            MenuItemCompat.setNumericShortcut(menuItem, this.f58358OooOOOo, this.f58360OooOOo0);
            PorterDuff.Mode mode = this.f58372OooOooO;
            if (mode != null) {
                MenuItemCompat.setIconTintMode(menuItem, mode);
            }
            ColorStateList colorStateList = this.f58370OooOoo;
            if (colorStateList != null) {
                MenuItemCompat.setIconTintList(menuItem, colorStateList);
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f58335OooO0o0 = clsArr;
        f58334OooO0o = clsArr;
    }

    public OooO0o(Context context) {
        super(context);
        this.f58338OooO0OO = context;
        Object[] objArr = {context};
        this.f58336OooO00o = objArr;
        this.f58337OooO0O0 = objArr;
    }

    public static Object OooO00o(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? OooO00o(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [OooOO0o.OooO0o] */
    /* JADX WARN: Type inference failed for: r3v13, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void OooO0O0(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        ?? r4;
        int i;
        XmlResourceParser xmlResourceParser2;
        ?? r8;
        ColorStateList colorStateList;
        OooO0O0 oooO0O0 = new OooO0O0(menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r4 = 1;
            i = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == r4) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType != 3) {
                    xmlResourceParser2 = xmlResourceParser;
                    r8 = r4;
                    z = z;
                } else {
                    String name2 = xmlResourceParser.getName();
                    if (z2 && name2.equals(str)) {
                        xmlResourceParser2 = xmlResourceParser;
                        r8 = r4;
                        z2 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            oooO0O0.f58345OooO0O0 = 0;
                            oooO0O0.f58346OooO0OO = 0;
                            oooO0O0.f58347OooO0Oo = 0;
                            oooO0O0.f58349OooO0o0 = 0;
                            oooO0O0.f58348OooO0o = r4;
                            oooO0O0.f58350OooO0oO = r4;
                        } else if (name2.equals("item")) {
                            if (!oooO0O0.f58351OooO0oo) {
                                ActionProvider actionProvider = oooO0O0.f58367OooOoO;
                                if (actionProvider == null || !actionProvider.hasSubMenu()) {
                                    oooO0O0.f58351OooO0oo = r4;
                                    oooO0O0.OooO0O0(oooO0O0.f58344OooO00o.add(oooO0O0.f58345OooO0O0, oooO0O0.f58343OooO, oooO0O0.f58352OooOO0, oooO0O0.f58353OooOO0O));
                                } else {
                                    oooO0O0.f58351OooO0oo = r4;
                                    oooO0O0.OooO0O0(oooO0O0.f58344OooO00o.addSubMenu(oooO0O0.f58345OooO0O0, oooO0O0.f58343OooO, oooO0O0.f58352OooOO0, oooO0O0.f58353OooOO0O).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlResourceParser2 = xmlResourceParser;
                            ?? r82 = r4;
                            z = r82 == true ? 1 : 0;
                            r8 = r82;
                        }
                        xmlResourceParser2 = xmlResourceParser;
                        r8 = r4;
                        z = z;
                    }
                }
                eventType = xmlResourceParser2.next();
                r4 = r8;
                i = 2;
                z = z;
                z2 = z2;
            } else {
                if (!z2) {
                    String name3 = xmlResourceParser.getName();
                    boolean zEquals = name3.equals("group");
                    OooO0o oooO0o = OooO0o.this;
                    if (zEquals) {
                        ?? ObtainStyledAttributes = oooO0o.f58338OooO0OO.obtainStyledAttributes(attributeSet, C20441OooO00o.f58295OooOOo0);
                        oooO0O0.f58345OooO0O0 = ObtainStyledAttributes.getResourceId(r4, 0);
                        oooO0O0.f58346OooO0OO = ObtainStyledAttributes.getInt(3, 0);
                        oooO0O0.f58347OooO0Oo = ObtainStyledAttributes.getInt(4, 0);
                        oooO0O0.f58349OooO0o0 = ObtainStyledAttributes.getInt(5, 0);
                        oooO0O0.f58348OooO0o = ObtainStyledAttributes.getBoolean(2, r4);
                        oooO0O0.f58350OooO0oO = ObtainStyledAttributes.getBoolean(0, r4);
                        ObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            C21565OoooOO0 c21565OoooOO0OooO0o0 = C21565OoooOO0.OooO0o0(oooO0o.f58338OooO0OO, attributeSet, C20441OooO00o.f58294OooOOo);
                            TypedArray typedArray = c21565OoooOO0OooO0o0.f63093OooO0O0;
                            oooO0O0.f58343OooO = typedArray.getResourceId(2, 0);
                            oooO0O0.f58352OooOO0 = (typedArray.getInt(5, oooO0O0.f58346OooO0OO) & SupportMenu.CATEGORY_MASK) | (typedArray.getInt(6, oooO0O0.f58347OooO0Oo) & 65535);
                            oooO0O0.f58353OooOO0O = typedArray.getText(7);
                            oooO0O0.f58354OooOO0o = typedArray.getText(8);
                            oooO0O0.f58356OooOOO0 = typedArray.getResourceId(0, 0);
                            String string = typedArray.getString(9);
                            oooO0O0.f58355OooOOO = string == null ? (char) 0 : string.charAt(0);
                            oooO0O0.f58357OooOOOO = typedArray.getInt(16, 4096);
                            String string2 = typedArray.getString(10);
                            oooO0O0.f58358OooOOOo = string2 == null ? (char) 0 : string2.charAt(0);
                            oooO0O0.f58360OooOOo0 = typedArray.getInt(20, 4096);
                            if (typedArray.hasValue(11)) {
                                oooO0O0.f58359OooOOo = typedArray.getBoolean(11, false) ? 1 : 0;
                            } else {
                                oooO0O0.f58359OooOOo = oooO0O0.f58349OooO0o0;
                            }
                            oooO0O0.f58361OooOOoo = typedArray.getBoolean(3, false);
                            oooO0O0.f58364OooOo00 = typedArray.getBoolean(4, oooO0O0.f58348OooO0o);
                            oooO0O0.f58363OooOo0 = typedArray.getBoolean(1, oooO0O0.f58350OooO0oO);
                            oooO0O0.f58365OooOo0O = typedArray.getInt(21, -1);
                            oooO0O0.f58368OooOoO0 = typedArray.getString(12);
                            oooO0O0.f58366OooOo0o = typedArray.getResourceId(13, 0);
                            oooO0O0.f58362OooOo = typedArray.getString(15);
                            String string3 = typedArray.getString(14);
                            boolean z3 = string3 != null;
                            if (z3 && oooO0O0.f58366OooOo0o == 0 && oooO0O0.f58362OooOo == null) {
                                oooO0O0.f58367OooOoO = (ActionProvider) oooO0O0.OooO00o(string3, f58334OooO0o, oooO0o.f58337OooO0O0);
                            } else {
                                if (z3) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                oooO0O0.f58367OooOoO = null;
                            }
                            oooO0O0.f58369OooOoOO = typedArray.getText(17);
                            oooO0O0.f58371OooOoo0 = typedArray.getText(22);
                            if (typedArray.hasValue(19)) {
                                oooO0O0.f58372OooOooO = C21545OooOooO.OooO0OO(typedArray.getInt(19, -1), oooO0O0.f58372OooOooO);
                                colorStateList = null;
                            } else {
                                colorStateList = null;
                                oooO0O0.f58372OooOooO = null;
                            }
                            if (typedArray.hasValue(18)) {
                                oooO0O0.f58370OooOoo = c21565OoooOO0OooO0o0.OooO00o(18);
                            } else {
                                oooO0O0.f58370OooOoo = colorStateList;
                            }
                            c21565OoooOO0OooO0o0.OooO0oO();
                            oooO0O0.f58351OooO0oo = false;
                            xmlResourceParser2 = xmlResourceParser;
                            r8 = 1;
                        } else if (name3.equals("menu")) {
                            r8 = 1;
                            oooO0O0.f58351OooO0oo = true;
                            SubMenu subMenuAddSubMenu = oooO0O0.f58344OooO00o.addSubMenu(oooO0O0.f58345OooO0O0, oooO0O0.f58343OooO, oooO0O0.f58352OooOO0, oooO0O0.f58353OooOO0O);
                            oooO0O0.OooO0O0(subMenuAddSubMenu.getItem());
                            xmlResourceParser2 = xmlResourceParser;
                            OooO0O0(xmlResourceParser2, attributeSet, subMenuAddSubMenu);
                        } else {
                            xmlResourceParser2 = xmlResourceParser;
                            r8 = 1;
                            str = name3;
                            z2 = true;
                        }
                        eventType = xmlResourceParser2.next();
                        r4 = r8;
                        i = 2;
                        z = z;
                        z2 = z2;
                    }
                }
                xmlResourceParser2 = xmlResourceParser;
                r8 = r4;
                z = z;
            }
            eventType = xmlResourceParser2.next();
            r4 = r8;
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof SupportMenu)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.f58338OooO0OO.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof OooO) {
                    OooO oooO = (OooO) menu;
                    if (oooO.isDispatchingItemsChanged()) {
                        oooO.stopDispatchingItemsChanged();
                        z = true;
                    }
                }
                OooO0O0(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((OooO) menu).startDispatchingItemsChanged();
                }
                layout.close();
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (z) {
                ((OooO) menu).startDispatchingItemsChanged();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
