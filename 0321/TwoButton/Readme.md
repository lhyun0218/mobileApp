
# 안드로이드 버튼 두 개 생성 예제

이 문서는 안드로이드 XML 레이아웃 코드에서 두 개의 버튼을 생성하는 예제에 대한 자세한 설명입니다.

## XML 코드

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<LinearLayout xmlns:android="[http://schemas.android.com/apk/res/android](http://schemas.android.com/apk/res/android)"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <Button
        android:id="@+id/button1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="첫 번째 버튼">
    </Button>

    <Button
        android:id="@+id/button2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="두 번째 버튼">
    </Button>

</LinearLayout>
