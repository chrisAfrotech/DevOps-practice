import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View,TouchableHighlight, TouchableNativeFeedback, Image, SafeAreaView } from 'react-native';

export default function App() {  
  const handlePress = () => console.log("Text pressed");
  console.log(require("./assets/splash.png"));
  return (
    <SafeAreaView style={styles.container}>
      <Text numberOfLines={1} onPress={handlePress}> 
        Hello react native. A really long text. Now i want to make this even longer and see what happens for very very long text. 
      </Text>
      <TouchableNativeFeedback onPress={() => console.log("Image tapped")}>
        <View style={{width:200, height:70 ,backgroundColor:"dodgerblue"}}></View>
      </TouchableNativeFeedback>
      <StatusBar style="auto" />
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center'
  },
});
