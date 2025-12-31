(function(global){
  const STORAGE_KEY = 'sis.items.v1';

  function loadItems(){
    try {
      const raw = localStorage.getItem(STORAGE_KEY);
      if (!raw) return [];
      const arr = JSON.parse(raw);
      return Array.isArray(arr) ? arr : [];
    } catch { return []; }
  }

  function saveItems(items){
    try { localStorage.setItem(STORAGE_KEY, JSON.stringify(items)); } catch {}
  }

  // UMD-style export
  const api = { STORAGE_KEY, loadItems, saveItems };
  if (typeof module !== 'undefined' && module.exports) {
    module.exports = api;
  } else {
    global.SisStorage = api;
  }
})(typeof window !== 'undefined' ? window : globalThis);
