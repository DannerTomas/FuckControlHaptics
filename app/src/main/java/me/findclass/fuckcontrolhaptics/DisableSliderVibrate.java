package me.findclass.fuckcontrolhaptics;

import android.view.View;

import de.robv.android.xposed.*;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
public class DisableSliderVibrate implements IXposedHookLoadPackage {
    private static final int SLIDER_HAPTIC_ID = 305;

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) {
        if (!lpparam.packageName.equals("com.android.systemui")) return;

        XposedBridge.log("---FuckControlHaptics---: Find system ui.");

        try{
            XposedHelpers.findAndHookMethod(View.class,
                    "performHapticFeedback", int.class, int.class, new XC_MethodHook() {
                        @Override
                        protected void beforeHookedMethod(MethodHookParam param) {
                            int feedbackConstant = (int) param.args[0];
                            if (feedbackConstant == SLIDER_HAPTIC_ID) {
                                param.setResult(false);
                            }
                        }
                    }
            );
        }catch (Exception e){
            XposedBridge.log("---FuckControlHaptics---: Load hook failed:" + e.getMessage());
        }
    }
}