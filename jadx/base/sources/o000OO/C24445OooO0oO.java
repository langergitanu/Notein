package o000OO;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: o000OO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24445OooO0oO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final HashMap<String, Constructor<? extends AbstractC24443OooO0Oo>> f82514OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap<Integer, ArrayList<AbstractC24443OooO0Oo>> f82515OooO00o = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends AbstractC24443OooO0Oo>> map = new HashMap<>();
        f82514OooO0O0 = map;
        try {
            map.put("KeyAttribute", C24444OooO0o0.class.getConstructor(new Class[0]));
            map.put("KeyPosition", C24446OooO0oo.class.getConstructor(new Class[0]));
            map.put("KeyCycle", OooO0o.class.getConstructor(new Class[0]));
            map.put("KeyTimeCycle", OooOO0.class.getConstructor(new Class[0]));
            map.put("KeyTrigger", OooOO0O.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e) {
            Log.e("KeyFrames", "unable to load", e);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C24445OooO0oO(Context context, XmlResourceParser xmlResourceParser) {
        HashMap<String, androidx.constraintlayout.widget.OooO00o> map;
        HashMap<String, androidx.constraintlayout.widget.OooO00o> map2;
        byte b;
        AbstractC24443OooO0Oo c24444OooO0o0;
        try {
            int eventType = xmlResourceParser.getEventType();
            AbstractC24443OooO0Oo abstractC24443OooO0Oo = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    if (f82514OooO0O0.containsKey(name)) {
                        switch (name.hashCode()) {
                            case -300573030:
                                b = !name.equals("KeyTimeCycle") ? (byte) -1 : (byte) 3;
                                break;
                            case -298435811:
                                if (name.equals("KeyAttribute")) {
                                    b = 0;
                                    break;
                                }
                                break;
                            case 540053991:
                                if (name.equals("KeyCycle")) {
                                    b = 2;
                                    break;
                                }
                                break;
                            case 1153397896:
                                if (name.equals("KeyPosition")) {
                                    b = 1;
                                    break;
                                }
                                break;
                            case 1308496505:
                                if (name.equals("KeyTrigger")) {
                                    b = 4;
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                        if (b == 0) {
                            c24444OooO0o0 = new C24444OooO0o0();
                        } else if (b == 1) {
                            c24444OooO0o0 = new C24446OooO0oo();
                        } else if (b == 2) {
                            c24444OooO0o0 = new OooO0o();
                        } else if (b == 3) {
                            c24444OooO0o0 = new OooOO0();
                        } else {
                            if (b != 4) {
                                throw new NullPointerException("Key " + name + " not found");
                            }
                            c24444OooO0o0 = new OooOO0O();
                        }
                        c24444OooO0o0.OooO0o0(context, Xml.asAttributeSet(xmlResourceParser));
                        OooO00o(c24444OooO0o0);
                        abstractC24443OooO0Oo = c24444OooO0o0;
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (abstractC24443OooO0Oo != null && (map2 = abstractC24443OooO0Oo.f82477OooO0OO) != null) {
                            androidx.constraintlayout.widget.OooO00o.OooO0Oo(context, xmlResourceParser, map2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && abstractC24443OooO0Oo != null && (map = abstractC24443OooO0Oo.f82477OooO0OO) != null) {
                        androidx.constraintlayout.widget.OooO00o.OooO0Oo(context, xmlResourceParser, map);
                    }
                } else if (eventType == 3 && "KeyFrameSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            Log.e("KeyFrames", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("KeyFrames", "Error parsing XML resource", e2);
        }
    }

    public final void OooO00o(AbstractC24443OooO0Oo abstractC24443OooO0Oo) {
        Integer numValueOf = Integer.valueOf(abstractC24443OooO0Oo.f82476OooO0O0);
        HashMap<Integer, ArrayList<AbstractC24443OooO0Oo>> map = this.f82515OooO00o;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(abstractC24443OooO0Oo.f82476OooO0O0), new ArrayList<>());
        }
        ArrayList<AbstractC24443OooO0Oo> arrayList = map.get(Integer.valueOf(abstractC24443OooO0Oo.f82476OooO0O0));
        if (arrayList != null) {
            arrayList.add(abstractC24443OooO0Oo);
        }
    }
}
