import { StatusBar } from 'expo-status-bar';
import { StyleSheet,SafeAreaView, Button } from 'react-native';

export default function App() {  
  const handlePress = () => console.log("Text pressed");
  console.log(require("./assets/splash.png"));
  return (
    <SafeAreaView style={styles.container}>
      <Button color ="orange" title="click Me" onPress={() => console.log("Button clicked")} />
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
