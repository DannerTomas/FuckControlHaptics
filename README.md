# FuckControlHaptics

[中文说明]README_zh.md

An LSPosed module that disables haptic feedback when adjusting volume or brightness in the ColorOS 15 control center.

## Description

This module specifically targets the annoying vibration feedback that occurs when you use the volume and brightness sliders in the ColorOS 15 control center. By hooking into the system UI, it prevents the haptic vibration while maintaining all other slider functionality.

## Features

- Removes haptic feedback from control center volume slider
- Removes haptic feedback from control center brightness slider  
- Preserves all other haptic feedback throughout the system
- Lightweight and efficient - only targets specific haptic events

## Requirements

- Android device with ColorOS 15
- LSPosed framework installed
- Root access (for LSPosed installation)

## Installation

1. Install the module APK
2. Enable the module in LSPosed
3. Apply to "System UI" (com.android.systemui)
4. Reboot your device

## Usage

Once installed and activated, the module works automatically. You will no longer feel vibration when:
- Dragging the volume slider in control center
- Dragging the brightness slider in control center

## Technical Details

The module hooks the `View.performHapticFeedback()` method and specifically blocks the haptic feedback constant `305` which is used by ColorOS 15 for control center slider interactions.

## Compatibility

- ColorOS 15
- OxygenOS 15 (based on ColorOS 15)
- May work on other ColorOS-based ROMs

## Disclaimer

This module is developed for educational purposes. Use at your own risk. The developer is not responsible for any issues caused by using this module.

## License

Open source - feel free to modify and distribute.